package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.sql.Timestamp;

/**
 * Fuwujilu entity. @author MyEclipse Persistence Tools
 */

public class Fuwujilu implements java.io.Serializable {

	// Fields

	private Integer jiluid;
	private Fuwushenbao fuwushenbao;
	private Yuangong yuangong;
	private Timestamp shijian;
	private Short zhuangtai;
	private String beizhuxinxi;

	// Constructors

	/** default constructor */
	public Fuwujilu() {
	}

	/** full constructor */
	public Fuwujilu(Fuwushenbao fuwushenbao, Yuangong yuangong,
			Timestamp shijian, Short zhuangtai, String beizhuxinxi) {
		this.fuwushenbao = fuwushenbao;
		this.yuangong = yuangong;
		this.shijian = shijian;
		this.zhuangtai = zhuangtai;
		this.beizhuxinxi = beizhuxinxi;
	}

	// Property accessors

	public Integer getJiluid() {
		return this.jiluid;
	}

	public void setJiluid(Integer jiluid) {
		this.jiluid = jiluid;
	}

	public Fuwushenbao getFuwushenbao() {
		return this.fuwushenbao;
	}

	public void setFuwushenbao(Fuwushenbao fuwushenbao) {
		this.fuwushenbao = fuwushenbao;
	}

	public Yuangong getYuangong() {
		return this.yuangong;
	}

	public void setYuangong(Yuangong yuangong) {
		this.yuangong = yuangong;
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

	public String getBeizhuxinxi() {
		return this.beizhuxinxi;
	}

	public void setBeizhuxinxi(String beizhuxinxi) {
		this.beizhuxinxi = beizhuxinxi;
	}

}