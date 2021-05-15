
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		person1.setName("Kamoru");
		person1.setAge(43);
		person1.setAddress("Some address");
		
		Person person2 = new Person();
		person2.setName("Ade");
		person2.setAge(23);
		person2.setAddress("Another address");
		
		System.out.println("Name "+ person1.getName() +" Age "+ person1.getAge()+ " Address "+ person1.getAddress());
		System.out.println("Name "+ person2.getName() +" Age "+ person2.getAge()+ " Address "+ person2.getAddress());
		
		

	}

}
