package com.riya.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riya.springbootrestapi.model.Employee;
import com.riya.springbootrestapi.repository.EmployeeRepository;
@Service
public class EmployeeDAO {
	
    @Autowired
	EmployeeRepository employeeRespository;
    
    /*to save an employee*/
    public Employee save(Employee emp) {
    	return employeeRespository.save(emp);
    }
    /*search all employees*/
    
    public List<Employee> findAll(){
    	return employeeRespository.findAll();
    }
    
    /*get an employee by Id*/
    
    public Employee findOne(Long empid) {
    	return employeeRespository.findOne(empid);
    }
    
    /*delete an employee*/
    
    public void delete(Employee emp) {
    	employeeRespository.delete(emp);
    }
}
