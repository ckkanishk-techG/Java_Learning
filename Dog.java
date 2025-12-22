public class Dog extends Animal implements LivingBeing {
    public void breath(){
        System.out.println("IN OUT IN OUT IN OUT");
    }
    public String fetch(){
        return "Chitta";
    }

    static String barkTone = "Bob bob bob";
    String breed = "Labrador";
    static int dogCount = 0;
    public static void main(String[] args) {

        Dog doggie=new Dog();
        Dog.dogCount++;
        Dog chitta=new Dog();
        Dog.dogCount++;
        System.out.println("Total Dogs: " + Dog.dogCount);
        doggie.sleep();
        chitta.barkTone="Woof woof woof";
        doggie.barkTone="Booooooooooowwwwww";
        chitta.breed="Human Robot Dog";
        doggie.breed="German Shepherd";
        System.out.println("Doggie Breed: " + doggie.breed);
        System.out.println("Chitta Breed: " + chitta.breed);
        System.out.println("Doggie Bark Tone: " + doggie.barkTone);
        System.out.println("Chitta Bark Tone: " + chitta.barkTone);
    }
}
