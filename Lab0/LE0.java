public class LE0
{
    int age;
    String name;
    void set_age(int age){
        this.age=age;
    }
    void set_name(String name){
        this.name=name;
    }
    int get_age(){
        return this.age;
    }
    String get_name(){
        return this.name;
    }
	public static void main(String[] args) {
	    Main ob=new Main();
	    ob.set_age(20);
	    ob.set_name("SNEHIL SHARMA");
	    System.out.println(ob.get_name()+" "+ob.get_age());
	}
}
