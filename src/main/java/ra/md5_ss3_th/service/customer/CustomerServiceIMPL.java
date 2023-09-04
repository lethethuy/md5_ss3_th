package ra.md5_ss3_th.service.customer;

import org.springframework.beans.factory.annotation.Autowired;
import ra.md5_ss3_th.model.Customer;
import ra.md5_ss3_th.model.Province;
import ra.md5_ss3_th.repository.ICustomerRepository;

import java.util.Optional;

public class CustomerServiceIMPL implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }
}
