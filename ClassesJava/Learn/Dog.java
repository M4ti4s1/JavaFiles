

package Learn;
public class Dog {
    // Attributes
    private String name;
    private int age;
    
    // Constructor
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void bark(){
        System.out.println("Hi");
    }

    public String getName(){
        return this.name;
    }

    public void setAge(String name){
        this.name = name;
    }

    public static String sayHello(String name){
        return ("Hello "+ name);
    }

    
}
