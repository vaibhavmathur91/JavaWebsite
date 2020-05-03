package vm.com.onlinestore.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Welcome {
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index() {
        System.out.println("Inside localhost:8080/ welcome page");
        return "onlinestore/welcome";
    }
}