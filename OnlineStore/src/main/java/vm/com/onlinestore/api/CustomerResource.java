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
    public List<Customer> getCustomers(){
        System.out.println("Inside GET localhost:8080/customers ");
        return customerService.getCustomers();
    }

    @GetMapping(value = "/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") int customerId) {
        System.out.println("Inside GET localhost:8080/customers/Id ");
        return customerService.getCustomer(customerId);
    }

    @PatchMapping(value = "/{customerId}")
    public Customer updateCustomer(@PathVariable("customerId") int customerId, @RequestBody Customer customer) {
        System.out.println("Inside PATCH localhost:8080/customers/Id ");
        return customerService.updateCustomer(customerId, customer);
    }

    @DeleteMapping(value = "/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") int customerId) {
        System.out.println("Inside DELETE localhost:8080/customers/Id ");
        customerService.deleteCustomer(customerId);
    }

}
