public class Main
{
	public static void main(String[] args) {
		
		Person person=new Person();
		person.setFirstName("");
		person.setLastName("");
		person.setAge(10);
		System.out.println("fullName= "+person.getFullName());
	}
}