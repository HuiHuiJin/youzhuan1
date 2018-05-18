package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Xinxilei entity. @author MyEclipse Persistence Tools
 */

public class Xinxilei implements java.io.Serializable {

	// Fields

	private Integer xinxileiid;
	private String xinxileiming;
	private String xinxishuoming;
	private Set xinxis = new HashSet(0);

	// Constructors

	/** default constructor */
	public Xinxilei() {
	}

	/** full constructor */
	public Xinxilei(String xinxileiming, String xinxishuoming, Set xinxis) {
		this.xinxileiming = xinxileiming;
		this.xinxishuoming = xinxishuoming;
		this.xinxis = xinxis;
	}

	// Property accessors

	public Integer getXinxileiid() {
		return this.xinxileiid;
	}

	public void setXinxileiid(Integer xinxileiid) {
		this.xinxileiid = xinxileiid;
	}

	public String getXinxileiming() {
		return this.xinxileiming;
	}

	public void setXinxileiming(String xinxileiming) {
		this.xinxileiming = xinxileiming;
	}

	public String getXinxishuoming() {
		return this.xinxishuoming;
	}

	public void setXinxishuoming(String xinxishuoming) {
		this.xinxishuoming = xinxishuoming;
	}

	public Set getXinxis() {
		return this.xinxis;
	}

	public void setXinxis(Set xinxis) {
		this.xinxis = xinxis;
	}

}