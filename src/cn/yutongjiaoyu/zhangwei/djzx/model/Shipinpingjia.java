package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.sql.Timestamp;

/**
 * Shipinpingjia entity. @author MyEclipse Persistence Tools
 */

public class Shipinpingjia implements java.io.Serializable {

	// Fields

	private Integer pingjiaid;
	private Yuangong yuangong;
	private Shipin shipin;
	private String pingjiaxinxi;
	private Timestamp pingjiashijian;

	// Constructors

	/** default constructor */
	public Shipinpingjia() {
	}

	/** full constructor */
	public Shipinpingjia(Yuangong yuangong, Shipin shipin, String pingjiaxinxi,
			Timestamp pingjiashijian) {
		this.yuangong = yuangong;
		this.shipin = shipin;
		this.pingjiaxinxi = pingjiaxinxi;
		this.pingjiashijian = pingjiashijian;
	}

	// Property accessors

	public Integer getPingjiaid() {
		return this.pingjiaid;
	}

	public void setPingjiaid(Integer pingjiaid) {
		this.pingjiaid = pingjiaid;
	}

	public Yuangong getYuangong() {
		return this.yuangong;
	}

	public void setYuangong(Yuangong yuangong) {
		this.yuangong = yuangong;
	}

	public Shipin getShipin() {
		return this.shipin;
	}

	public void setShipin(Shipin shipin) {
		this.shipin = shipin;
	}

	public String getPingjiaxinxi() {
		return this.pingjiaxinxi;
	}

	public void setPingjiaxinxi(String pingjiaxinxi) {
		this.pingjiaxinxi = pingjiaxinxi;
	}

	public Timestamp getPingjiashijian() {
		return this.pingjiashijian;
	}

	public void setPingjiashijian(Timestamp pingjiashijian) {
		this.pingjiashijian = pingjiashijian;
	}

}