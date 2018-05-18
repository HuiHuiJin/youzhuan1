package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Ziduan entity. @author MyEclipse Persistence Tools
 */

public class Ziduan implements java.io.Serializable {

	// Fields

	private Integer ziduanid;
	private Caijibiao caijibiao;
	private String ziduanming;
	private Short changdu;
	private String beizhu;
	private Set ziduanjilus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Ziduan() {
	}

	/** full constructor */
	public Ziduan(Caijibiao caijibiao, String ziduanming, Short changdu,
			String beizhu, Set ziduanjilus) {
		this.caijibiao = caijibiao;
		this.ziduanming = ziduanming;
		this.changdu = changdu;
		this.beizhu = beizhu;
		this.ziduanjilus = ziduanjilus;
	}

	// Property accessors

	public Integer getZiduanid() {
		return this.ziduanid;
	}

	public void setZiduanid(Integer ziduanid) {
		this.ziduanid = ziduanid;
	}

	public Caijibiao getCaijibiao() {
		return this.caijibiao;
	}

	public void setCaijibiao(Caijibiao caijibiao) {
		this.caijibiao = caijibiao;
	}

	public String getZiduanming() {
		return this.ziduanming;
	}

	public void setZiduanming(String ziduanming) {
		this.ziduanming = ziduanming;
	}

	public Short getChangdu() {
		return this.changdu;
	}

	public void setChangdu(Short changdu) {
		this.changdu = changdu;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public Set getZiduanjilus() {
		return this.ziduanjilus;
	}

	public void setZiduanjilus(Set ziduanjilus) {
		this.ziduanjilus = ziduanjilus;
	}

}