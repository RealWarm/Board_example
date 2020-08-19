package org.zerock.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace=
			"org.zerock.mapper.MemberMapper";

	@Override
	public String getTime() {		
		log.info("MemberDAOImpl :: getTime invoked!!");
		return sqlSession.selectOne(namespace+".getTime");
	}//getTime

	@Override
	public void insertMember(MemberVO vo) {
		log.info("MemberDAOImpl :: insertMember invoked!!");
		sqlSession.insert(namespace + ".insertMember", vo);		
	}//insertMember	

	@Override
	public MemberVO readMember(String userid) {
		
		return null;
	}//readMember

	@Override
	public MemberVO readWithPW(String userid, String userpw) {

		return null;
	}//readWithPW
	
}//end
