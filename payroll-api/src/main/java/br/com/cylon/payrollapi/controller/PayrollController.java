package br.com.cylon.payrollapi.controller;

import br.com.cylon.payrollapi.client.UserFeign;
import br.com.cylon.payrollapi.dto.PayrollDTO;
import br.com.cylon.payrollapi.dto.UserDTO;
import br.com.cylon.payrollapi.service.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payrolls")
public class PayrollController {

    private final PayrollService payrollService;

    //CONSTRUCTOR

    public PayrollController(PayrollService payrollService) {
        this.payrollService = payrollService;
    }

    //GET

    @GetMapping("/{workerId}")
    public ResponseEntity<PayrollDTO> getPayroll(@PathVariable Long workerId, @RequestBody PayrollDTO payrollDTO) {
        PayrollDTO payroll = payrollService.retrievePayroll(workerId, payrollDTO);
        return ResponseEntity.ok(payroll);
    }

}
