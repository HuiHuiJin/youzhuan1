package cn.yutongjiaoyu.zhangwei.djzx.model;

/**
 * Yuangongzhaopian entity. @author MyEclipse Persistence Tools
 */

public class Yuangongzhaopian implements java.io.Serializable {

	// Fields

	private Integer zhaopianid;
	private Yuangong yuangong;
	private String zhaopianuri;
	private String beizhu;

	// Constructors

	/** default constructor */
	public Yuangongzhaopian() {
	}

	/** full constructor */
	public Yuangongzhaopian(Yuangong yuangong, String zhaopianuri, String beizhu) {
		this.yuangong = yuangong;
		this.zhaopianuri = zhaopianuri;
		this.beizhu = beizhu;
	}

	// Property accessors

	public Integer getZhaopianid() {
		return this.zhaopianid;
	}

	public void setZhaopianid(Integer zhaopianid) {
		this.zhaopianid = zhaopianid;
	}

	public Yuangong getYuangong() {
		return this.yuangong;
	}

	public void setYuangong(Yuangong yuangong) {
		this.yuangong = yuangong;
	}

	public String getZhaopianuri() {
		return this.zhaopianuri;
	}

	public void setZhaopianuri(String zhaopianuri) {
		this.zhaopianuri = zhaopianuri;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

}