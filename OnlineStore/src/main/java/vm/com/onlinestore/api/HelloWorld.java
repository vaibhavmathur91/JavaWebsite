package vm.com.onlinestore.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HelloWorld {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        System.out.println("Here inside");
        return "api/welcome";
    }
}