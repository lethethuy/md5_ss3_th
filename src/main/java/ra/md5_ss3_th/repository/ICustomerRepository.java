package ra.md5_ss3_th.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ra.md5_ss3_th.model.Customer;
import ra.md5_ss3_th.model.Province;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}

