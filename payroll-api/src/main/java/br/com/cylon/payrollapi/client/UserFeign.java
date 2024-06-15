package br.com.cylon.payrollapi.client;

import br.com.cylon.payrollapi.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "user-api")
public interface UserFeign {

    @GetMapping("/api/users/{id}")
    ResponseEntity<UserDTO> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<UserDTO>> findAll();

}
