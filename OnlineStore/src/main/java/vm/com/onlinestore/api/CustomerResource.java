package vm.com.onlinestore.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vm.com.onlinestore.model.Customer;
import vm.com.onlinestore.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerResource {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        System.out.println("Inside POST localhost:8080/customers ");
        return customerService.addCustomer(customer);
    }

    @GetMapping
    public List<Customer> getCustomer(){
        System.out.println("Inside GET localhost:8080/customers ");
        return customerService.getCustomers();
    }
}
