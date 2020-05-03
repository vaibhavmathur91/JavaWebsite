package vm.com.onlinestore.access;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vm.com.onlinestore.model.Customer;

import java.util.List;


@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> {
    @Override
    List<Customer> findAll();
}




