package com.genuinecoder.springserver;

import com.genuinecoder.springserver.model.employee.Employee;
import com.genuinecoder.springserver.model.employee.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringServerApplicationTests {

	@Autowired
	private EmployeeDao employeeDao;

	@Test
	void addEmployeeTest() {
		Employee employee = new Employee();
		employee.setName("Ali Dinar");
		employee.setLocation("Building-5");
		employee.setBranch("IT");
		employeeDao.save(employee);
	}

	//@Test
	/*void getAllEmployees(){
		List<Employee> employeeList = employeeDao.getAllEmployee();
		System.out.println(employeeList);
	}*/

	//@Test
	/*void getAllEmployeesAndDeleteThem(){
		List<Employee> employeeList = employeeDao.getAllEmployee();
		for (Employee employee : employeeList){
			employeeDao.delete(employee.getId());
		}
	}*/

	//@Test
	void deleteById(int employeeid){
		List<Employee> employeeList = employeeDao.getAllEmployee();
		employeeDao.deleteById(employeeid);
	}

}
