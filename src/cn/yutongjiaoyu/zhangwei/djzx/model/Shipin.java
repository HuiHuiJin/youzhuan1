package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Shipin entity. @author MyEclipse Persistence Tools
 */

public class Shipin implements java.io.Serializable {

	// Fields

	private Integer shipinid;
	private Shipinfenlei shipinfenlei;
	private String shipinbiaoti;
	private String shipingongzuorenyuan;
	private String shipinuri;
	private Boolean zhuangtai;
	private String shuoming;
	private Set shipinpingjias = new HashSet(0);

	// Constructors

	/** default constructor */
	public Shipin() {
	}

	/** full constructor */
	public Shipin(Shipinfenlei shipinfenlei, String shipinbiaoti,
			String shipingongzuorenyuan, String shipinuri, Boolean zhuangtai,
			String shuoming, Set shipinpingjias) {
		this.shipinfenlei = shipinfenlei;
		this.shipinbiaoti = shipinbiaoti;
		this.shipingongzuorenyuan = shipingongzuorenyuan;
		this.shipinuri = shipinuri;
		this.zhuangtai = zhuangtai;
		this.shuoming = shuoming;
		this.shipinpingjias = shipinpingjias;
	}

	// Property accessors

	public Integer getShipinid() {
		return this.shipinid;
	}

	public void setShipinid(Integer shipinid) {
		this.shipinid = shipinid;
	}

	public Shipinfenlei getShipinfenlei() {
		return this.shipinfenlei;
	}

	public void setShipinfenlei(Shipinfenlei shipinfenlei) {
		this.shipinfenlei = shipinfenlei;
	}

	public String getShipinbiaoti() {
		return this.shipinbiaoti;
	}

	public void setShipinbiaoti(String shipinbiaoti) {
		this.shipinbiaoti = shipinbiaoti;
	}

	public String getShipingongzuorenyuan() {
		return this.shipingongzuorenyuan;
	}

	public void setShipingongzuorenyuan(String shipingongzuorenyuan) {
		this.shipingongzuorenyuan = shipingongzuorenyuan;
	}

	public String getShipinuri() {
		return this.shipinuri;
	}

	public void setShipinuri(String shipinuri) {
		this.shipinuri = shipinuri;
	}

	public Boolean getZhuangtai() {
		return this.zhuangtai;
	}

	public void setZhuangtai(Boolean zhuangtai) {
		this.zhuangtai = zhuangtai;
	}

	public String getShuoming() {
		return this.shuoming;
	}

	public void setShuoming(String shuoming) {
		this.shuoming = shuoming;
	}

	public Set getShipinpingjias() {
		return this.shipinpingjias;
	}

	public void setShipinpingjias(Set shipinpingjias) {
		this.shipinpingjias = shipinpingjias;
	}

}