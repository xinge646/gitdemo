package service;

import java.util.List;
import java.util.Map;

import entity.Bill;
import entity.Page;

public interface BillService {

	//�鿴�����б�
    public List<Bill> Query(String name,String ment,Page page);
	
    //������ҳ��
	public int count(String name,String ment);
	
	//��ѯ�ܼ�¼��
	public int count1(String name, String ment);
}
