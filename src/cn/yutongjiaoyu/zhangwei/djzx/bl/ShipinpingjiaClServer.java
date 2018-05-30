package cn.yutongjiaoyu.zhangwei.djzx.bl;

import cn.yutongjiaoyu.zhangwei.djzx.model.*;

public class ShipinpingjiaClServer {
	
	public static void save(Shipinpingjia instance){
		ShipinpingjiaDAO dao=new ShipinpingjiaDAO();
		dao.save(instance);
	}

}
