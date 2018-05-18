package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Renwu entity. @author MyEclipse Persistence Tools
 */

public class Renwu implements java.io.Serializable {

	// Fields

	private Integer renwuid;
	private Bumen bumen;
	private String renwuming;
	private String renwuxiangxi;
	private Timestamp qishishijian;
	private Timestamp zhongzhishijian;
	private Set yuangongrenwus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Renwu() {
	}

	/** full constructor */
	public Renwu(Bumen bumen, String renwuming, String renwuxiangxi,
			Timestamp qishishijian, Timestamp zhongzhishijian,
			Set yuangongrenwus) {
		this.bumen = bumen;
		this.renwuming = renwuming;
		this.renwuxiangxi = renwuxiangxi;
		this.qishishijian = qishishijian;
		this.zhongzhishijian = zhongzhishijian;
		this.yuangongrenwus = yuangongrenwus;
	}

	// Property accessors

	public Integer getRenwuid() {
		return this.renwuid;
	}

	public void setRenwuid(Integer renwuid) {
		this.renwuid = renwuid;
	}

	public Bumen getBumen() {
		return this.bumen;
	}

	public void setBumen(Bumen bumen) {
		this.bumen = bumen;
	}

	public String getRenwuming() {
		return this.renwuming;
	}

	public void setRenwuming(String renwuming) {
		this.renwuming = renwuming;
	}

	public String getRenwuxiangxi() {
		return this.renwuxiangxi;
	}

	public void setRenwuxiangxi(String renwuxiangxi) {
		this.renwuxiangxi = renwuxiangxi;
	}

	public Timestamp getQishishijian() {
		return this.qishishijian;
	}

	public void setQishishijian(Timestamp qishishijian) {
		this.qishishijian = qishishijian;
	}

	public Timestamp getZhongzhishijian() {
		return this.zhongzhishijian;
	}

	public void setZhongzhishijian(Timestamp zhongzhishijian) {
		this.zhongzhishijian = zhongzhishijian;
	}

	public Set getYuangongrenwus() {
		return this.yuangongrenwus;
	}

	public void setYuangongrenwus(Set yuangongrenwus) {
		this.yuangongrenwus = yuangongrenwus;
	}

}