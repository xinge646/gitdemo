package dao;

import java.util.List;
import java.util.Map;

import entity.Bill;
import entity.Page;

public interface Billdao {
	
	//�鿴�����б�
	public List<Bill> Query(Map map);
	
	//������ҳ��
	public int count(Map map);
	
	//��ѯ�ܼ�¼
	public int count1(Map map);
}
