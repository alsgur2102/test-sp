package com.test.sp;

import static org.junit.Assert.assertEquals;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MybatisTest {

	@Autowired
	private SqlSession ss;
	
	@Test
	public void ssTets() {
		assertEquals(3, ss.selectList("com.test.sp.TTINFO.selectTTINFO").size()); 
	}
	
	@Test
	public void ssTest2() {
		assertEquals(1, ss.selectOne("com.test.sp.TTINFO.selectTTINFOone",1));  
	}
}
