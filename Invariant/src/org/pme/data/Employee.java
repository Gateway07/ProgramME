package org.pme.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    public Long id;
    public String firstName;
    public String lastName;
    public String email;

}
