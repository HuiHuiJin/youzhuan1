package cn.yutongjiaoyu.zhangwei.djzx;

import java.util.List;

import cn.yutongjiaoyu.zhangwei.djzx.model.Shipinpingjia;
import cn.yutongjiaoyu.zhangwei.djzx.model.ShipinpingjiaDAO;

public class Run {

	public static void main(String[] args) {
		ShipinpingjiaDAO dao=new ShipinpingjiaDAO();
		List<Shipinpingjia> list=dao.findPage(2, 5);
		for(Shipinpingjia s:list){
			System.out.println(s.getPingjiaid());
		}
	}

}
