package coaching.administrator.classes.District;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictService {

    @Autowired
    private DistrictRepository repository;

    public District saveDistrict(District district) {
        return repository.save(district);
    }

    public District getDistrictById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public District getDistrictByName(String name) {
        return repository.findByName(name);
    }

    public List<District> getDistrictByDivision(Integer id) {
        return repository.findByDivisionId(id);
    }

    public String deleteDistrict(Integer id) {
        repository.deleteById(id);
        return "District with id : " + id + " deleted";
    }

}