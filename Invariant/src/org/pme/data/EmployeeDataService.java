package org.pme.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EmployeeDataService {
    @Autowired
    private EmployeeCrudRepository repository;

    @Transactional
    public void testEmployeesCrudRepository() {
        Optional<Employee> employeesOptional = repository.findById(127L);

    }
}
