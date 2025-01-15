package org.pme.data;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@SpringBootTest
public class DataBase {
    @Autowired
    private EmployeeCrudRepository repository;

    @Test
    @Transactional
    public void testFindByFirstNameAndLastName() {
        List<Employee> employees = repository.getEmploes("Ivanov");
    }
}
