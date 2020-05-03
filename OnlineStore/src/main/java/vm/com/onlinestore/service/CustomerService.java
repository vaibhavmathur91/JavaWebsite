package vm.com.onlinestore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vm.com.onlinestore.access.CustomerDAO;
import vm.com.onlinestore.exceptions.CustomerNotFoundException;
import vm.com.onlinestore.model.Customer;

import java.util.List;
import java.util.Optional;


@Component
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    public Customer addCustomer(Customer customer) {
        return customerDAO.save(customer);
    }

    public List<Customer> getCustomers() {
        return customerDAO.findAll();
    }

    public Customer getCustomer(int customerId) {
        Optional<Customer> optionalCustomer = customerDAO.findById(customerId);
        if(!optionalCustomer.isPresent()){
            throw new CustomerNotFoundException("Customer Record is not available...");
        }
        return optionalCustomer.get();
    }

    public Customer updateCustomer(int customerId, Customer customer) {
        customer.setCustomerId(customerId);
        return customerDAO.save(customer);
    }

    public void deleteCustomer(int customerId) {
        customerDAO.deleteById(customerId);
    }
}
