package vm.com.onlinestore.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Home {
    @GetMapping
    public String index() {
        System.out.println("Inside localhost:8080/  welcome page");
        return "Hello, This is Home Page";
    }
}