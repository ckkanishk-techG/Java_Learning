public class Dog extends Animal implements LivingBeing {
    public void breath(){
        System.out.println("IN OUT IN OUT IN OUT");
    }
    public String fetch(){
        return "Chitta";
    }
    
    public String makeSound(){
        return "BOW BOW";
    }
}
