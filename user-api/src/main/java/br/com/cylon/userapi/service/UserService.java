package br.com.cylon.userapi.service;

import br.com.cylon.userapi.domain.User;
import br.com.cylon.userapi.repository.UserRepository;
import br.com.cylon.userapi.service.exception.ObjectNotFoundException;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;
    private final Environment env;

    //CONSTRUCTOR

    public UserService(UserRepository repository, Environment env) {
        this.repository = repository; this.env = env;
    }

    //

    public User findById(Long id) {
        System.out.println("findById: " + id + " - Port: " + env.getProperty("local.server.port"));
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }

   public List<User> findAll() {
        return repository.findAll();
    }

}
