package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8Demo {

	private static List<Employee> employeeData() {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		return employeeList;
	}

	public static void main(String[] args) {
		List<Employee> employeeList = employeeData();

		// Query 3.1 : How many male and female employees are there in the organization?

		employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
				.forEach((x, y) -> System.out.println(x + " " + y));

		// Query 3.2 : Print the name of all departments in the organization?
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		// Query 3.3 : What is the average age of male and female employees?

		Map<String, Double> avgAgeOfMaleAndFemaleEmployee = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAgeOfMaleAndFemaleEmployee);

		// Get the details of highest paid employee in the organization?

		Optional<Employee> collect = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(collect.get());

		// Get the names of all employees who have joined after 2015?

		employeeList.stream().filter(x -> x.yearOfJoining > 2015).map(Employee::getName).forEach(System.out::println);

		// Query 3.6 : Count the number of employees in each department?

		Map<String, Long> empInEachDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(empInEachDepartment);

		// Query 3.7 : What is the average salary of each department?

		Map<String, Double> avgSal = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSal);

		// Query 3.8 : Get the details of youngest male employee in the product
		// development department?

		Optional<Employee> youngestEmp = employeeList.stream()
				.filter(x -> x.gender == "Male" && x.getDepartment() == "Product Development")
				.collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)));
		System.out.println(youngestEmp.get());

		// Query 3.9 : Who has the most working experience in the organization?

		Optional<Employee> seniorMostEmpl = employeeList.stream()
				.sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

		System.out.println(seniorMostEmpl.get());

		// Query 3.10 : How many male and female employees are there in the sales and
		// marketing team?

		Map<String, Long> countMaleFemaleEmployeesInSalesMarketing = employeeList.stream()
				.filter(x -> x.getDepartment() == "Sales And Marketing")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(countMaleFemaleEmployeesInSalesMarketing);

		// What is the average salary of male and female employees?

		Map<String, Double> avgSalMaleAndFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalMaleAndFemale);

		// Query 3.12 : List down the names of all employees in each department?

		Map<String, List<Employee>> allEmp = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		allEmp.forEach((key, value) -> {

			System.out.println("Employees in " + key);

			System.out.println("------");
			value.forEach(x -> System.out.println(x.getName()));
		});

		// Query 3.14 : Separate the employees who are younger or equal to 25 years from
		// those employees who are older than 25 years.

		Map<Boolean, List<Employee>> empCategorize = employeeList.stream()
				.collect(Collectors.partitioningBy(emp -> emp.getAge() > 25));

		empCategorize.forEach((k, v) -> {

			if (k) {
				System.out.println("employees older than 25");
			} else {
				System.out.println("employees younger than or equal 25");
			}
			
			v.forEach(emp->System.out.println(emp.getName()));

		});
	}

}
