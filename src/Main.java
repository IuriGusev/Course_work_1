import java.util.Arrays;

public class Main {
    public static Employee[] employees = new Employee[10];

    public static Employee[] ptintEmloyees() {
        for (Employee employee : employees) {
            if (employee != null) {
                return employees;
            }
            System.out.println(employees);
        }
        return new Employee[10];
    }

    public static Employee[] calculateAmmountSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        if (employees != null) {
            return employees;
        }
    }

    public static Employee employeeMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
            if (employee != null) {
                return employee;
            }
            return result;
        }
        return result;
    }

        public static Employee employeeMaxSalary () {
            Employee result = employees[0];
            int maxSalary = employees[0].getSalary();
            for (Employee employee : employees) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    result = employee;
                }
            if (employee != null) {
            return employee;
                }
            return result;
            }
            return result;
        }

        public static Employee calculateMiddleSalary () {
            return calculateAmmountSalary() / new Employee[].length;
        }

        public static void printEveryNames () {
            for (Employee employee : employees) {
                System.out.println(employee.getSurname());
            }
        }
        public static void main (String[]args) {
            Employee worker1 = new Employee("Иван", "Иванович", "Иванов", 1, 1000);
            Employee worker2 = new Employee("Борис", "Борисович", "Борисов", 2, 2000);
            Employee worker3 = new Employee("Василий", "Вальевич", "Васильев", 3, 3000);
            Employee worker4 = new Employee("Георгий", "Георгиевич", "Георгиев", 4, 4000);
            Employee worker5 = new Employee("Петр", "Петрович", "Петров", 5, 5000);

            employees[0] = worker1;
            employees[1] = worker2;
            employees[2] = worker3;
            employees[3] = worker4;
            employees[4] = worker5;
            System.out.println(Arrays.toString(employees));
            System.out.println(calculateAmmountSalary());
            System.out.println(calculateMiddleSalary());
            System.out.println(employeeMinSalary());
            System.out.println(employeeMaxSalary());
        }
    }
