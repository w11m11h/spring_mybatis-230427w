package com.moohee.mybatis_w.dao;

import java.util.ArrayList;

import com.moohee.mybatis_w.dto.BoardDto;

public interface IDao {

	public void writeDao(String mwriter, String mcontent); //�Խ��� �۾���	
	public ArrayList<BoardDto> listDao(); //�Խ��� ����Ʈ ��������	
	public void deleteDao(String mid); //�Խù� ����
	
}
