package JavaObjectOriented;

public abstract class Employee{

    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number){
        System.out.println("Construction an employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public abstract double computePay(); // 抽象方法，后面连花括号都没有了

    public void mailCheck(){
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString(){
        return this.name + " " + this.address + " " + this.number;
    }

    public String getName(){
        return name;
    }

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String newAddress) {
//        address = newAddress;
//    }
//
//    public int getNumber() {
//        return number;
//    }

}


