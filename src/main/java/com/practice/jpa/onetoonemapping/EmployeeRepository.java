package com.practice.jpa.onetoonemapping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("select e from Employee e left join FETCH e.aadhar where e.id =:id")
    Employee findByIdWithAadharDetails(Integer id);
}
