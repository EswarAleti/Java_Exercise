public class Main
{
	public static void main(String[] args) 
	{
		Printer printer1=new Printer(100,true);
		System.out.println("Initial number of pages printed: "+printer1.getPagesPrinted());
		System.out.println("Number of pages printed now is "+printer1.printPages(10));
		System.out.println("Total number of pages printed till now is "+printer1.getPagesPrinted());
		System.out.println("Number of pages printed now is "+printer1.printPages(11));
		System.out.println("Total number of pages printed till now is "+printer1.getPagesPrinted());

		Printer printer2=new Printer(100,false);
		System.out.println("Initial number of pages printed: "+printer2.getPagesPrinted());
		System.out.println("Number of pages printed now is "+printer2.printPages(10));
		System.out.println("Total number of pages printed till now is "+printer2.getPagesPrinted());
		System.out.println("Number of pages printed now is "+printer2.printPages(11));
		System.out.println("Total number of pages printed till now is "+printer2.getPagesPrinted());
	}
}