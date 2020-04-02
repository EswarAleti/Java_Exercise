public class Demo
{
	public static void main(String[] args) 
	{
		//Creating object to store
		VideoStore store=new VideoStore();
		//Adding videos
		store.addVideo("ABC");
		store.addVideo("DEF");
		store.addVideo("GHI");
		store.addVideo("JKL");	
		store.addVideo("MNO");
		store.addVideo("PQR");
		store.addVideo("STU");
		store.addVideo("VWX");
		store.addVideo("YZA");
		store.addVideo("BCD");
		store.addVideo("ABC");
		//Checking out video
		store.checkOutVideo(5);
	}
}