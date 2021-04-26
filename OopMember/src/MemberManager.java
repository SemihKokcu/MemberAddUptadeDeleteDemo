
public class MemberManager {
	
	public void Add(Member member) {
		
		System.out.println("New Member Added : "+member.name+" "+member.surname);
		
	}
    public void Uptade(Member member) {
		
		System.out.println("Member Uptaded : "+member.name+" "+member.surname);
		
	}
    public void Delete(Member member) {
    	
    	System.out.println("New Member Deleted : "+member.name+" "+member.surname);
		member.id = 0;
		member.name ="";
		member.surname="";
		member.identityNumber="";
		member.mail="";
		member.phone="";
		
		
	}
	
	

}
