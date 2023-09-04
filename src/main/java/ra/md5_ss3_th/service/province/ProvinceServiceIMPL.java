package ra.md5_ss3_th.service.province;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.md5_ss3_th.model.Province;
import ra.md5_ss3_th.repository.IProvinceRepository;

import java.util.Optional;

@Service
public class ProvinceServiceIMPL implements IProvinceService{
    @Autowired
    private IProvinceRepository provinceRepository;
    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Optional<Province> findById(Long id) {
        return provinceRepository.findById(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }

}
