package miams.maps;
import miams.maps.auth.AuthenticationService;
import miams.maps.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static miams.maps.core.Role.ADMIN;

@SpringBootApplication

public class MiamsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiamsApplication.class, args);

    }



    @Bean
    public CommandLineRunner commandLineRunner(
            AuthenticationService service
    ) {
        return args -> {
            var admin = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("admin@mail.com")
                    .password("password")
                    .role(ADMIN)
                    .build();
            System.out.println("Admin token: " + service.register(admin).getAccessToken());


        };
    }
}
