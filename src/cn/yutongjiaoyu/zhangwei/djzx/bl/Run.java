package cn.yutongjiaoyu.zhangwei.djzx.bl;

import cn.yutongjiaoyu.zhangwei.djzx.model.Bumen;
import cn.yutongjiaoyu.zhangwei.djzx.model.BumenDAO;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BumenDAO bumendao=new BumenDAO();
		Bumen bumen=new Bumen();
		bumen.setBumenming("Ãû×Ö");
		bumendao.save(bumen);
	}

}
