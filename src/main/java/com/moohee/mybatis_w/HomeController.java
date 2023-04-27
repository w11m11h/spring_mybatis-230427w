package com.moohee.mybatis_w;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.moohee.mybatis_w.dao.IDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private SqlSession sqlSession; //sqlSession ���� �����̳ʿ��� �ڵ� ����
	
	@RequestMapping(value = "/list")
	public String list() {		
		return "list";
	}
	
	@RequestMapping(value = "/write_form")
	public String write_form() {		
		return "writeForm";
	}
	
	@RequestMapping(value = "/write")
	public String write(HttpServletRequest request) {
		String mwriter = request.getParameter("mwrtier");
		String mcontent = request.getParameter("mcontent");
		
		IDao dao = sqlSession.getMapper(IDao.class);
		
		dao.writeDao(mwriter, mcontent);
		
		return "redirect:list";
	}
	
}
