public class Application {
    public static void main(String[] args) {
        Animal animal=new Dog();
        LivingBeing dog=new Dog();
        System.out.println(((Animal)dog).makeSound());
        System.out.println(animal.makeSound());
        System.out.println(((Dog)dog).fetch());
        ((Dog)dog).breath();
    }
}
