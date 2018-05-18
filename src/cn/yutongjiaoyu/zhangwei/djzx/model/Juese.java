package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Juese entity. @author MyEclipse Persistence Tools
 */

public class Juese implements java.io.Serializable {

	// Fields

	private Integer jueseid;
	private String jueseming;
	private String juesejieshao;
	private Set yonghuJueses = new HashSet(0);
	private Set juesequanxians = new HashSet(0);

	// Constructors

	/** default constructor */
	public Juese() {
	}

	/** full constructor */
	public Juese(String jueseming, String juesejieshao, Set yonghuJueses,
			Set juesequanxians) {
		this.jueseming = jueseming;
		this.juesejieshao = juesejieshao;
		this.yonghuJueses = yonghuJueses;
		this.juesequanxians = juesequanxians;
	}

	// Property accessors

	public Integer getJueseid() {
		return this.jueseid;
	}

	public void setJueseid(Integer jueseid) {
		this.jueseid = jueseid;
	}

	public String getJueseming() {
		return this.jueseming;
	}

	public void setJueseming(String jueseming) {
		this.jueseming = jueseming;
	}

	public String getJuesejieshao() {
		return this.juesejieshao;
	}

	public void setJuesejieshao(String juesejieshao) {
		this.juesejieshao = juesejieshao;
	}

	public Set getYonghuJueses() {
		return this.yonghuJueses;
	}

	public void setYonghuJueses(Set yonghuJueses) {
		this.yonghuJueses = yonghuJueses;
	}

	public Set getJuesequanxians() {
		return this.juesequanxians;
	}

	public void setJuesequanxians(Set juesequanxians) {
		this.juesequanxians = juesequanxians;
	}

}