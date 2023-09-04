package ra.md5_ss3_th.service.customer;


import ra.md5_ss3_th.model.Customer;
import ra.md5_ss3_th.model.Province;
import ra.md5_ss3_th.service.IGenerateService;

public interface ICustomerService extends IGenerateService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
