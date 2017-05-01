package sample.simple.domain.Department;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sample.simple.SampleSimpleApplication;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.iterableWithSize;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SampleSimpleApplication.class)
public class DepartmentServiceTest {

    @Autowired
    private DepartmentService service;

    @Test
    public void findAll_AllEntitiesAvailable() {
        Iterable<Department> departments = service.getAll();
        assertThat(departments, iterableWithSize(2));
    }

    @Test
    public void add_Succeed() {
        String code = RandomStringUtils.randomAlphabetic(5);
        String label = RandomStringUtils.randomAlphabetic(5);
        String desc = RandomStringUtils.randomAlphabetic(5);
        Department newDepartment = new Department.Builder().code(code).description(desc).label(label).build();
        Department saved = service.add(newDepartment);
        assertThat(saved.getCode(), is(newDepartment.getCode()));
        assertThat(service.getAll(), iterableWithSize(3));
    }

}