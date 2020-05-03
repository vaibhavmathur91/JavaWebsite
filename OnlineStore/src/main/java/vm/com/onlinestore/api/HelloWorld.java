package vm.com.onlinestore.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorld {
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String index() {
        System.out.println("Inside localhost:8080/hello welcome page");
        return "onlinestore/welcome";
    }
}