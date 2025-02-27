public class Singleton{
    private static Singleton uniqueInstance=new Singleton();
    private Singleton(){
        System.out.println("One Instance created.");
    }
    public static Singleton getInstance(){
        return uniqueInstance;
    }
}