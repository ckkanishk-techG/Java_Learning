public interface Sleepable {
    void sleep();
    default void sleep(int hours){
        System.out.println("I ma slooeepaing for " + hours + " hours...");
    }
}
