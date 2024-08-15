package JavaConcepts.SortingObjects.ComparableDemo;

import java.util.*;
//Single Field Comparison: Use Comparable when there’s a single field (like roll number, name, or date) that naturally determines the order of objects.
//Multi-Field Comparison: Implement logic within compareTo to compare multiple fields when necessary (like salary and name).
//Consistent Sorting: Ideal when the class has a natural, consistent ordering that is used across different parts of your codebase.
public class ComparableExample {
    public static void main(String[] args) {
        example1();
        example2();
    }

    public static void example1(){
        // Natural ordering by rollNumber
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        Collections.sort(students); // Sorts students by rollNumber

        for (Student student : students) {
            System.out.println(student);
        }
    }



    public static void example2(){
        //if two employees have the same salary, they should be ordered by name.
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 60000));
        employees.add(new Employee("Charlie", 50000));
        employees.add(new Employee("David", 70000));

        Collections.sort(employees); // Sorts employees by salary, then by name

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
