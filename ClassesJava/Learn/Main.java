package Learn;

public class Main {
    public static void main(String[] args){
        Dog dog1 = new Dog("Duki", 12);
        dog1.bark();
        
        System.out.println(dog1.getName());
        String some = Dog.sayHello("Matias");
    }
}
