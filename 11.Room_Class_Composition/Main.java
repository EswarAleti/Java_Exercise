public class Main
{
	public static void main(String[] args) 
	{
		Furniture furniture=new Furniture("Dining table","Stanfield","Used for seated persons to eat meals",20000);
		Electronics electronics=new Electronics("Telivison","Sony","Can watch entertainment and News",40000);
		Room room=new Room(furniture,electronics);
		room.getFurnitureDetails();
		System.out.println("Name of Electronics: "+room.getElectronics().getName());
		System.out.println("Company: "+room.getElectronics().getCompany());
		System.out.println("Use: "+room.getElectronics().getUse());
		System.out.println("Cost: "+room.getElectronics().getCost());
	}
}