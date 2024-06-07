package pe.edu.cibertec.app_security_backoffice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AppSecurityBackofficeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppSecurityBackofficeApplication.class, args);
	}

}
