package JavaConcepts.SortingObjects.ComparableDemo;

//Suppose we have an Employee class where employees are naturally ordered by their salary,
// and if two employees have the same salary, they should be ordered by name.

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    //if two employees have the same salary, they should be ordered by name.
    public int compareTo(Employee other) {
        int salaryComparison = Double.compare(this.salary, other.salary);
        if (salaryComparison == 0) {
            return this.name.compareTo(other.name); // If salaries are equal, compare by name
        }
        return salaryComparison;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + '}';
    }
}

