public class PuppyTest {
    public static void main(String[] args){
        Puppy myPuppy = new Puppy("狗蛋");
        myPuppy.setAge(19);
        myPuppy.getAge();
        System.out.println("直接访问对象的成员：" + myPuppy.puppyAge);
    }
}