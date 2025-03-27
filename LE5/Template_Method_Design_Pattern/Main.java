class Main{
    public static void main(String[] args){
        System.out.println("Want Whisky!");
        Beverage ob=new Whisky();
        ob.templateMethod(30);
        System.out.println("\nWant Beer!");
        ob=new Beer();
        ob.templateMethod(100);
    }
}