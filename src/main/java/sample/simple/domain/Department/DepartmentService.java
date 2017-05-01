package sample.simple.domain.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private DepartmentRepository repository;

    @Autowired
    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public Iterable<Department> getAll() {
        return repository.findAll();
    }

    public Department add(Department department) {
        return repository.save(department);
    }
}
