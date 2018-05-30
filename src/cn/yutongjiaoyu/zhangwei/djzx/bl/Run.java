package cn.yutongjiaoyu.zhangwei.djzx.bl;


import cn.yutongjiaoyu.zhangwei.djzx.model.*;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShipinDAO dao=new ShipinDAO();
		System.out.println(dao.findById(2));
		
	}

}
