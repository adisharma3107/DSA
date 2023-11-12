import java.util.*;
public class Employee {

        public static void main(String[] args) {

            // Create a list of employees
            List<Employee> employees = Arrays.asList(
                    new Employee("John Doe", 30, 100000),
                    new Employee("Jane Doe", 25, 90000),
                    new Employee("Peter Smith", 35, 120000)
            );

            // Find the maximum salary
            int maxSalary = employees.stream().mapToInt(Employee::getSalary).max().getAsInt();

            // Find the sum of all salaries
            int sumSalary = employees.stream().mapToInt(Employee::getSalary).sum();

            // Find the minimum salary
            int minSalary = employees.stream().mapToInt(Employee::getSalary).min().getAsInt();

            // Check if any employee's salary is greater than 300
            boolean isSalaryGreaterThan300 = employees.stream().anyMatch(employee -> employee.getSalary() > 300);

            // Print the results
            System.out.println("Maximum salary: " + maxSalary);
            System.out.println("Sum of all salaries: " + sumSalary);
            System.out.println("Minimum salary: " + minSalary);
            System.out.println("Is any employee's salary greater than 300: " + isSalaryGreaterThan300);
        }

        private String name;
        private int age;
        private int salary;

        public Employee(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }
}
