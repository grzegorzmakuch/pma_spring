package pl.mqhstudio.pma.dao;

import org.springframework.data.repository.CrudRepository;
import pl.mqhstudio.pma.entities.Employee;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    @Override
    public List<Employee> findAll();

}
