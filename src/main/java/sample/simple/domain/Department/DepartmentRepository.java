package sample.simple.domain.Department;

import org.springframework.data.repository.CrudRepository;

interface DepartmentRepository extends CrudRepository<Department, String>{
}