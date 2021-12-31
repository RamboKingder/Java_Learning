package JavaObjectOriented;

public class Salary extends Employee{
    private double salary;
    public Salary(String name, String address, int number, double salary){
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }

    public void setSalary(double newSalary){
        if(newSalary > 0.0){
            salary = newSalary;
        }
    }

    public double getSalary(){
        return salary;
    }

    public double computePay(){ // 这里重写了父类的computePay方法
        // 子类继承了父类的getName()方法，居然可以不用super关键字就直接调用
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}
