
public class Main {

	public static void main(String[] args) {
		
		
		Member member1 = new Member();
		member1.id =1;
		member1.name="semih";
		member1.surname="kkc";
		member1.mail="hiworl@gmail.com";
		member1.identityNumber="1234561234";
		member1.phone="09501472589";
		
		Member member2 = new Member();
		member2.id =2;
		member2.name="melih";
		member2.surname="kkc";
		member2.mail="sadafal@gmail.com";
		member2.identityNumber="54324561234";
		member2.phone="014587945654";
		
		Member member3 = new Member(3,"ahmet","kkc","colimoli@gmail.com","87965412365","2547896524");
		
		Member[] members = {member1,member2,member3};
		
		for (Member member : members) {
			System.out.println(member.name);
		}
		
		MemberManager memberManager = new MemberManager();
		memberManager.Add(member1);
		memberManager.Uptade(member2);
		memberManager.Delete(member3);
		
		
		

	}

}
