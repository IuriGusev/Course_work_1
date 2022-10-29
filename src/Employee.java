public class Employee {
private static int meter = 0;
private Integer id;
private String name;
private String middleName;
private String surname;
private int department;
private int salary;

public Employee (String name, String middleName, String surname, int department, int salary){
    this.name = name;
    this.middleName = middleName;
    this.surname = surname;
    this.salary = salary;
    this.id = meter++;
}
public String getName () { return name;}
    public String getMiddleName () { return middleName;}
    public String getSurname () {return surname;}
    public int getDepartment () {return department;}
    public void setDepartment(int department) { this.department = department;}
    public Integer getId () { return this.id;}
    public int getSalary() { return salary;}
    public void setSalary(int salary) { this.salary = salary;}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", surname='" + surname + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}

