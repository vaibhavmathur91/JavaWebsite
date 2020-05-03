package vm.com.onlinestore.service;

import vm.com.onlinestore.model.Customer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CustomerService {
    private List<Customer> customerList = new CopyOnWriteArrayList<Customer>();
    private int customerIdCount = 1;
    public Customer addCustomer(Customer customer) {
        customer.setCustomerId(customerIdCount++);
        customerList.add(customer);
        return customer;
//        return customerDAO.save(customer);
    }

    public List<Customer> getCustomers() {
        return customerList;
    }

    public Customer getCustomer(int customerId) {
//        Optional<Customer> optionalCustomer = customerDAO.findById(customerId);
//        if(!optionalCustomer.isPresent())
//            throw new CustomerNotFoundException("Customer Record is not available...");
//        return optionalCustomer.get();

        return customerList
                .stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();
    }

    public Customer updateCustomer(int customerId, Customer customer) {
//        customer.setCustomerId(customerId);
//        return customerDAO.save(customer);
         customerList
            .stream()
            .forEach(c->{
                if(c.getCustomerId() == customerId){
                    c.setCustomerFirstName(customer.getCustomerFirstName());
                    c.setCustomerLastName(customer.getCustomerLastName());
                    c.setCustomerEmail(customer.getCustomerEmail());
                }
            });
        return customerList
                .stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();

    }

    public void deleteCustomer(int customerId) {
//        customerDAO.deleteById(customerId);

        customerList
            .stream()
            .forEach(c->{
                if(c.getCustomerId() == customerId){
                    customerList.remove(c);
                }
            });
    }
}
