package vm.com.onlinestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"vm.com.onlinestore.api", "vm.com.onlinestore.welcome"})
public class OnlinestoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlinestoreApplication.class, args);
    }

}
