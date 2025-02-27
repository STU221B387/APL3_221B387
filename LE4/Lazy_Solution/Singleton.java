public class Singleton{
    private static Singleton uniqueInstance;
    private Singleton(){
        System.out.println("One Instance created.");
    }
    public static Singleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new Singleton();
        }
        return uniqueInstance;
    }
}