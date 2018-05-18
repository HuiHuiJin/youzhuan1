package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.sql.Timestamp;

/**
 * Yuangongrenwu entity. @author MyEclipse Persistence Tools
 */

public class Yuangongrenwu implements java.io.Serializable {

	// Fields

	private Integer duiyingid;
	private Renwu renwu;
	private Yuangong yuangong;
	private Timestamp wanchengshijian;
	private Short zhuangtai;
	private String beizhu;

	// Constructors

	/** default constructor */
	public Yuangongrenwu() {
	}

	/** full constructor */
	public Yuangongrenwu(Renwu renwu, Yuangong yuangong,
			Timestamp wanchengshijian, Short zhuangtai, String beizhu) {
		this.renwu = renwu;
		this.yuangong = yuangong;
		this.wanchengshijian = wanchengshijian;
		this.zhuangtai = zhuangtai;
		this.beizhu = beizhu;
	}

	// Property accessors

	public Integer getDuiyingid() {
		return this.duiyingid;
	}

	public void setDuiyingid(Integer duiyingid) {
		this.duiyingid = duiyingid;
	}

	public Renwu getRenwu() {
		return this.renwu;
	}

	public void setRenwu(Renwu renwu) {
		this.renwu = renwu;
	}

	public Yuangong getYuangong() {
		return this.yuangong;
	}

	public void setYuangong(Yuangong yuangong) {
		this.yuangong = yuangong;
	}

	public Timestamp getWanchengshijian() {
		return this.wanchengshijian;
	}

	public void setWanchengshijian(Timestamp wanchengshijian) {
		this.wanchengshijian = wanchengshijian;
	}

	public Short getZhuangtai() {
		return this.zhuangtai;
	}

	public void setZhuangtai(Short zhuangtai) {
		this.zhuangtai = zhuangtai;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

}