import java.util.ArrayList;

public class Dog {
    private boolean isHungry=true ;
    private ArrayList<Dog> offSpring ;
    private Owner owner ;
    private String dogName ;
    public Dog(String name,boolean newIsHungry){
    offSpring=new ArrayList<Dog>();
    this.dogName=name ;
    }

    public String feedDog() {
        if(isHungry==true) {
            isHungry=false ;
            return "Dog has been fed";
        }
        else{
            return "Dog is not hungry";
        }
    }
    public String getDogName(){
        return dogName;
    }
    public String getOwner() {
        String owner1=owner.getOwner1();
        return owner1 ;
    }
    public void setOwner(String b){
        this.owner =new Owner(b);

    }

    public ArrayList<Dog> getOffSpring(){
        return offSpring ;
    }
    public void setOffSpring(Dog a) {
        this.offSpring.add(a);
    }
    public void dogNames(){
        for(Dog puppies: offSpring){
        String dogs=puppies.getDogName();
            System.out.println(dogs);
        }
    }
}
