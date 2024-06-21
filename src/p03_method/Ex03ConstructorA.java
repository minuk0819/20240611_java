package p03_method;

public class Ex03ConstructorA {
  public static void main(String[] args) {
    Employee employee = new Employee("LGH", 1, "2000-10-10", 22, "male");
    System.out.println(employee.getEname());
    Employee employee1 = new Employee();
    Employee employee2 = new Employee();
  }
}

class Employee {
  { System.out.println("Initial Block instance"); }
  static { System.out.println("Initial Block static"); }
  private String ename;
  private int eno;
  private String hireDate;
  private int age;
  private String gender;

  public Employee() {
  }

  public Employee(String ename, int eno, String hireDate, int age, String gender) {
    this.ename = ename;
    this.eno = eno;
    this.hireDate = hireDate;
    this.age = age;
    this.gender = gender;
  }

  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }

  public int getEno() {
    return eno;
  }

  public void setEno(int eno) {
    this.eno = eno;
  }

  public String getHireDate() {
    return hireDate;
  }

  public void setHireDate(String hireDate) {
    this.hireDate = hireDate;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}