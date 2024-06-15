package br.com.cylon.userapi;

import br.com.cylon.userapi.domain.User;
import br.com.cylon.userapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository; //will be used to save users when the application starts

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
				new User("John Doe", "johndoe@email", "john123", 10.0),
				new User("Jane Doe", "janedoe@email", "jane123", 15.0),
				new User("Alice", "alice@email", "alice123", 20.0)
		));
	}
}
