public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name){
        // 因为参数name和成员name重名了，所以必须用this来指出成员name
        this.name = name;
    }

    // 函数名和参数名居然可以一样
    public void empAge(int empAge){
        age = empAge;
    }

    public void empDesignation(String empDesig){
        designation = empDesig;
    }

    public void empSalary(double empSalary){
        salary = empSalary;
    }

    public void printEmployee(){
        System.out.println("名字：" + name);
        System.out.println("年龄：" + age);
        System.out.println("职位：" + designation);
        System.out.println("薪水：" + salary);
    }
}

