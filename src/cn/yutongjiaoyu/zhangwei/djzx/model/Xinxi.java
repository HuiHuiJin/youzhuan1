package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Xinxi entity. @author MyEclipse Persistence Tools
 */

public class Xinxi implements java.io.Serializable {

	// Fields

	private Integer xinxiid;
	private Yuangong yuangongByShenheren;
	private Yuangong yuangongByFabuzhe;
	private Xinxilei xinxilei;
	private String xinxibiaoti;
	private String xinxifubiaoti;
	private String xinxineirong;
	private Timestamp xinxishijian;
	private Boolean zhuangtai;
	private Set taolunqus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Xinxi() {
	}

	/** full constructor */
	public Xinxi(Yuangong yuangongByShenheren, Yuangong yuangongByFabuzhe,
			Xinxilei xinxilei, String xinxibiaoti, String xinxifubiaoti,
			String xinxineirong, Timestamp xinxishijian, Boolean zhuangtai,
			Set taolunqus) {
		this.yuangongByShenheren = yuangongByShenheren;
		this.yuangongByFabuzhe = yuangongByFabuzhe;
		this.xinxilei = xinxilei;
		this.xinxibiaoti = xinxibiaoti;
		this.xinxifubiaoti = xinxifubiaoti;
		this.xinxineirong = xinxineirong;
		this.xinxishijian = xinxishijian;
		this.zhuangtai = zhuangtai;
		this.taolunqus = taolunqus;
	}

	// Property accessors

	public Integer getXinxiid() {
		return this.xinxiid;
	}

	public void setXinxiid(Integer xinxiid) {
		this.xinxiid = xinxiid;
	}

	public Yuangong getYuangongByShenheren() {
		return this.yuangongByShenheren;
	}

	public void setYuangongByShenheren(Yuangong yuangongByShenheren) {
		this.yuangongByShenheren = yuangongByShenheren;
	}

	public Yuangong getYuangongByFabuzhe() {
		return this.yuangongByFabuzhe;
	}

	public void setYuangongByFabuzhe(Yuangong yuangongByFabuzhe) {
		this.yuangongByFabuzhe = yuangongByFabuzhe;
	}

	public Xinxilei getXinxilei() {
		return this.xinxilei;
	}

	public void setXinxilei(Xinxilei xinxilei) {
		this.xinxilei = xinxilei;
	}

	public String getXinxibiaoti() {
		return this.xinxibiaoti;
	}

	public void setXinxibiaoti(String xinxibiaoti) {
		this.xinxibiaoti = xinxibiaoti;
	}

	public String getXinxifubiaoti() {
		return this.xinxifubiaoti;
	}

	public void setXinxifubiaoti(String xinxifubiaoti) {
		this.xinxifubiaoti = xinxifubiaoti;
	}

	public String getXinxineirong() {
		return this.xinxineirong;
	}

	public void setXinxineirong(String xinxineirong) {
		this.xinxineirong = xinxineirong;
	}

	public Timestamp getXinxishijian() {
		return this.xinxishijian;
	}

	public void setXinxishijian(Timestamp xinxishijian) {
		this.xinxishijian = xinxishijian;
	}

	public Boolean getZhuangtai() {
		return this.zhuangtai;
	}

	public void setZhuangtai(Boolean zhuangtai) {
		this.zhuangtai = zhuangtai;
	}

	public Set getTaolunqus() {
		return this.taolunqus;
	}

	public void setTaolunqus(Set taolunqus) {
		this.taolunqus = taolunqus;
	}

}