package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Caijibiao entity. @author MyEclipse Persistence Tools
 */

public class Caijibiao implements java.io.Serializable {

	// Fields

	private Integer caijibiaoid;
	private Bumen bumen;
	private String caijibiaoming;
	private String shuoming;
	private Set ziduanjilus = new HashSet(0);
	private Set ziduans = new HashSet(0);

	// Constructors

	/** default constructor */
	public Caijibiao() {
	}

	/** full constructor */
	public Caijibiao(Bumen bumen, String caijibiaoming, String shuoming,
			Set ziduanjilus, Set ziduans) {
		this.bumen = bumen;
		this.caijibiaoming = caijibiaoming;
		this.shuoming = shuoming;
		this.ziduanjilus = ziduanjilus;
		this.ziduans = ziduans;
	}

	// Property accessors

	public Integer getCaijibiaoid() {
		return this.caijibiaoid;
	}

	public void setCaijibiaoid(Integer caijibiaoid) {
		this.caijibiaoid = caijibiaoid;
	}

	public Bumen getBumen() {
		return this.bumen;
	}

	public void setBumen(Bumen bumen) {
		this.bumen = bumen;
	}

	public String getCaijibiaoming() {
		return this.caijibiaoming;
	}

	public void setCaijibiaoming(String caijibiaoming) {
		this.caijibiaoming = caijibiaoming;
	}

	public String getShuoming() {
		return this.shuoming;
	}

	public void setShuoming(String shuoming) {
		this.shuoming = shuoming;
	}

	public Set getZiduanjilus() {
		return this.ziduanjilus;
	}

	public void setZiduanjilus(Set ziduanjilus) {
		this.ziduanjilus = ziduanjilus;
	}

	public Set getZiduans() {
		return this.ziduans;
	}

	public void setZiduans(Set ziduans) {
		this.ziduans = ziduans;
	}

}