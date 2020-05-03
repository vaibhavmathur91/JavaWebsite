package vm.com.onlinestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
@ComponentScan({
        "vm.com.onlinestore.api",
        "vm.com.onlinestore.welcome",
        "vm.com.onlinestore.service"
})
public class OnlinestoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlinestoreApplication.class, args);
    }

}
