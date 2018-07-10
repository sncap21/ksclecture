package day0629.jdbc;

import java.util.List;

public class MemberDAOTest {

	public static void main(String[] args) {
		MemberDTO member = new MemberDTO();
		member.setId("test2");
		member.setName("테스트2");
		member.setPassword("2222");
		member.setEmail("test2@test2.com");
		MemberDAO dao = new MemberDAOImpl();
//		int result = dao.addMember(member);
//		if(result == 1)
//			System.out.println("성공");
//		else
//			System.out.println("실패!!");
		
		MemberDTO resultMember = dao.getMember("carami");
		System.out.println(resultMember);
		
		List<MemberDTO> memberList = dao.getMemberList();
		for (MemberDTO rmember : memberList) {
			System.out.println(rmember);
		}
	}

}
