package org.zerock.persistence;

import org.zerock.domain.MemberVO;

public interface MemberDAO {
	
	public String getTime() throws Exception;;
	
	public void insertMember(MemberVO vo) throws Exception;;
	
	public MemberVO readMember(String userid) throws Exception;;
	
	public MemberVO readWithPW(String userid, String userpw) throws Exception;;

}//end
