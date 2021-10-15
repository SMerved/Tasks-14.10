import java.util.ArrayList;

public class DogKennel {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bernard", true);
        dog1.setOwner("Soren");
        String s=dog1.getOwner();
        dog1.setOffSpring(new Dog("BernardsPuppy", true));
        dog1.setOffSpring(new Dog("secondPuppy",true));
        ArrayList<Dog> myOffSpring=dog1.getOffSpring();
       dog1.dogNames();
        System.out.println(dog1.getDogName());
        System.out.println(s);
    String hungry=dog1.feedDog();
        System.out.println(hungry);
    }
    }
