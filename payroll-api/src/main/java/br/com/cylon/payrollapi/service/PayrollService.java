package br.com.cylon.payrollapi.service;

import br.com.cylon.payrollapi.client.UserFeign;
import br.com.cylon.payrollapi.dto.PayrollDTO;
import br.com.cylon.payrollapi.dto.UserDTO;
import br.com.cylon.payrollapi.service.exception.ObjectNotFoundException;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PayrollService {

    private final UserFeign userFeign;

    public PayrollService(UserFeign userFeign) {
        this.userFeign = userFeign;
    }

    public PayrollDTO retrievePayroll(Long workerId, PayrollDTO payrollDTO) {
        try {
            UserDTO user = userFeign.findById(workerId).getBody();
            Double totalPayment = user.getHourlyPrice() * payrollDTO.getWorkedHours();
            PayrollDTO payroll = null;
            if(Objects.nonNull(user)) {
                payroll = new PayrollDTO(
                        user.getName(),
                        payrollDTO.getDescription(),
                        user.getHourlyPrice(),
                        payrollDTO.getWorkedHours(),
                        totalPayment
                );
            }
            //return new PayrollDTO(user.getBody());
            return payroll;
        } catch (FeignException.NotFound ex) {
            //log.error("Error retrieving payroll", e);
            throw new ObjectNotFoundException("User not found");
        } catch (Exception ex) {
            //log.error("Error retrieving payroll", e);
            ex.printStackTrace();
            throw new RuntimeException("Error retrieving payroll");
        }
    }

}
