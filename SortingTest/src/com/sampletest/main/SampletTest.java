package com.sampletest.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



import com.sampletest.model.Employee;

public class SampletTest {

	public static void main(String args[]) {
		Employee emp1 = new Employee("Prithivi", "+919272978272");
		Employee emp2 = new Employee("Thomas", "+919272978273");
		Employee emp3 = new Employee("Venkat", "+919272978274");
		Employee emp4 = new Employee("Decoders", "+919272978572");
		Employee emp5 = new Employee("Ashwin", "+919272978276");
		Employee emp6 = new Employee("George", "+919272978277");
		Employee emp7 = new Employee("Pavithran", "+919272979272");
		Employee emp8 = new Employee("Prithivi", "+919272978272");
		Employee emp9 = new Employee("Albert", "+919272978279");
		Employee emp10 = new Employee("Sample", "+919272978270");

	   List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		empList.add(emp7);
		empList.add(emp8);
		empList.add(emp9);
		empList.add(emp10);
		
		Comparator<Employee> sortByPhone=Comparator.comparing(Employee::getPhone);
		
		empList.stream().sorted(sortByPhone).forEach(e -> {
			System.out.println(e.getPhone());
		});
		
		
		
		
	}
}
