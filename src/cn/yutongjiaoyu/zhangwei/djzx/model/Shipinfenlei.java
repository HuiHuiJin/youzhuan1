package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Shipinfenlei entity. @author MyEclipse Persistence Tools
 */

public class Shipinfenlei implements java.io.Serializable {

	// Fields

	private Integer shipinfenleiid;
	private String fenleiming;
	private String fenleijieshao;
	private Set shipins = new HashSet(0);

	// Constructors

	/** default constructor */
	public Shipinfenlei() {
	}

	/** full constructor */
	public Shipinfenlei(String fenleiming, String fenleijieshao, Set shipins) {
		this.fenleiming = fenleiming;
		this.fenleijieshao = fenleijieshao;
		this.shipins = shipins;
	}

	// Property accessors

	public Integer getShipinfenleiid() {
		return this.shipinfenleiid;
	}

	public void setShipinfenleiid(Integer shipinfenleiid) {
		this.shipinfenleiid = shipinfenleiid;
	}

	public String getFenleiming() {
		return this.fenleiming;
	}

	public void setFenleiming(String fenleiming) {
		this.fenleiming = fenleiming;
	}

	public String getFenleijieshao() {
		return this.fenleijieshao;
	}

	public void setFenleijieshao(String fenleijieshao) {
		this.fenleijieshao = fenleijieshao;
	}

	public Set getShipins() {
		return this.shipins;
	}

	public void setShipins(Set shipins) {
		this.shipins = shipins;
	}

}