package pl.mqhstudio.pma.dao;

import org.springframework.data.repository.CrudRepository;

import pl.mqhstudio.pma.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
