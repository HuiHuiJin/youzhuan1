package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.sql.Timestamp;

/**
 * Ziduanjilu entity. @author MyEclipse Persistence Tools
 */

public class Ziduanjilu implements java.io.Serializable {

	// Fields

	private Integer ziduanjiluid;
	private Caijibiao caijibiao;
	private Yuangong yuangong;
	private Ziduan ziduan;
	private String ziduanxinxi;
	private Timestamp shijian;
	private String beizhu;

	// Constructors

	/** default constructor */
	public Ziduanjilu() {
	}

	/** full constructor */
	public Ziduanjilu(Caijibiao caijibiao, Yuangong yuangong, Ziduan ziduan,
			String ziduanxinxi, Timestamp shijian, String beizhu) {
		this.caijibiao = caijibiao;
		this.yuangong = yuangong;
		this.ziduan = ziduan;
		this.ziduanxinxi = ziduanxinxi;
		this.shijian = shijian;
		this.beizhu = beizhu;
	}

	// Property accessors

	public Integer getZiduanjiluid() {
		return this.ziduanjiluid;
	}

	public void setZiduanjiluid(Integer ziduanjiluid) {
		this.ziduanjiluid = ziduanjiluid;
	}

	public Caijibiao getCaijibiao() {
		return this.caijibiao;
	}

	public void setCaijibiao(Caijibiao caijibiao) {
		this.caijibiao = caijibiao;
	}

	public Yuangong getYuangong() {
		return this.yuangong;
	}

	public void setYuangong(Yuangong yuangong) {
		this.yuangong = yuangong;
	}

	public Ziduan getZiduan() {
		return this.ziduan;
	}

	public void setZiduan(Ziduan ziduan) {
		this.ziduan = ziduan;
	}

	public String getZiduanxinxi() {
		return this.ziduanxinxi;
	}

	public void setZiduanxinxi(String ziduanxinxi) {
		this.ziduanxinxi = ziduanxinxi;
	}

	public Timestamp getShijian() {
		return this.shijian;
	}

	public void setShijian(Timestamp shijian) {
		this.shijian = shijian;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

}