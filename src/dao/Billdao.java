package dao;

import java.util.List;
import java.util.Map;

import entity.Bill;
import entity.Page;

public interface Billdao {
	
	//查看订单列表
	public List<Bill> Query(Map map);
	
	//计算总页数
	public int count(Map map);
	
	//查询总记录
	public int count1(Map map);
}
