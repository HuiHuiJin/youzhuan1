package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Fuwushenbao entity. @author MyEclipse Persistence Tools
 */

public class Fuwushenbao implements java.io.Serializable {

	// Fields

	private Integer shenbaoid;
	private Yuangong yuangong;
	private Bumen bumen;
	private String shenbaoxiangxi;
	private Timestamp shijian;
	private Short zhuangtai;
	private String beizhu;
	private Set fuwujilus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Fuwushenbao() {
	}

	/** full constructor */
	public Fuwushenbao(Yuangong yuangong, Bumen bumen, String shenbaoxiangxi,
			Timestamp shijian, Short zhuangtai, String beizhu, Set fuwujilus) {
		this.yuangong = yuangong;
		this.bumen = bumen;
		this.shenbaoxiangxi = shenbaoxiangxi;
		this.shijian = shijian;
		this.zhuangtai = zhuangtai;
		this.beizhu = beizhu;
		this.fuwujilus = fuwujilus;
	}

	// Property accessors

	public Integer getShenbaoid() {
		return this.shenbaoid;
	}

	public void setShenbaoid(Integer shenbaoid) {
		this.shenbaoid = shenbaoid;
	}

	public Yuangong getYuangong() {
		return this.yuangong;
	}

	public void setYuangong(Yuangong yuangong) {
		this.yuangong = yuangong;
	}

	public Bumen getBumen() {
		return this.bumen;
	}

	public void setBumen(Bumen bumen) {
		this.bumen = bumen;
	}

	public String getShenbaoxiangxi() {
		return this.shenbaoxiangxi;
	}

	public void setShenbaoxiangxi(String shenbaoxiangxi) {
		this.shenbaoxiangxi = shenbaoxiangxi;
	}

	public Timestamp getShijian() {
		return this.shijian;
	}

	public void setShijian(Timestamp shijian) {
		this.shijian = shijian;
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

	public Set getFuwujilus() {
		return this.fuwujilus;
	}

	public void setFuwujilus(Set fuwujilus) {
		this.fuwujilus = fuwujilus;
	}

}