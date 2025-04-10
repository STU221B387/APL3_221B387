public class Main
{
	public static void main(String[] args) {
		Offering offering=new Coffee();
		offering=new Rum(offering);
		offering=new Rum(offering);
		System.out.println(offering.getName()+" "+offering.getPrice());
		
		Offering offering1=new Tea();
		offering1=new Gin(offering1);
		System.out.println(offering1.getName()+" "+offering1.getPrice());
		
		Offering offering2=new Icecream();
		offering2=new Soda(offering2);
		offering2=new Soda(offering2);
		System.out.println(offering2.getName()+" "+offering2.getPrice());
	}
}
