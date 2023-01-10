package org.example;

class Employee {
    private String empname;
    private int empno;
    Employee() {// Constructor default
        System.out.println("I am a default constructor");
        empname = "Sugan";
        empno = 1001;
    }
    void EmployeeInfo() {//method
        System.out.println("EMPLOYEENAME:" + empname);
        System.out.println("EMPLOYEENO:" + empno);
    }
}
class EmployeeData {
    public static void main(String[] args) {
        Employee e1 = new Employee();//calling constructor
        e1.EmployeeInfo();

    }
}
