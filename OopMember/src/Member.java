
public class Member {
	
	public Member() {
		
		System.out.println("Member Details");
		
	}
	public Member(int id,String name,String surname,String identityNumber,String mail,String phone) {
		
		this();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.identityNumber = identityNumber;
		this.mail = mail;
		this.phone = phone;
	}
	
	int id;
	String name;
	String surname;
	String identityNumber;
	String mail;
	String phone;
	
	

}
