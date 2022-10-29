import java.util.Arrays;

public class Main {
    public static Employee[] employees = new Employee[10];

    public static void ptintEmloyees() {
        for (Employee employee : employees) {
            System.out.println(employees);
        }
    }

    public static int calculateAmmountSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Object employeeMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
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
                return result;
            }
            return result;
        }

        public static float calculateMiddleSalary () {
            return calculateAmmountSalary() / (float) employees.length;
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
