package cn.yutongjiaoyu.zhangwei.djzx.model;

/**
 * Taolunqu entity. @author MyEclipse Persistence Tools
 */

public class Taolunqu implements java.io.Serializable {

	// Fields

	private Integer taolunid;
	private Xinxi xinxi;
	private Yuangong yuangong;
	private String neirong;

	// Constructors

	/** default constructor */
	public Taolunqu() {
	}

	/** full constructor */
	public Taolunqu(Xinxi xinxi, Yuangong yuangong, String neirong) {
		this.xinxi = xinxi;
		this.yuangong = yuangong;
		this.neirong = neirong;
	}

	// Property accessors

	public Integer getTaolunid() {
		return this.taolunid;
	}

	public void setTaolunid(Integer taolunid) {
		this.taolunid = taolunid;
	}

	public Xinxi getXinxi() {
		return this.xinxi;
	}

	public void setXinxi(Xinxi xinxi) {
		this.xinxi = xinxi;
	}

	public Yuangong getYuangong() {
		return this.yuangong;
	}

	public void setYuangong(Yuangong yuangong) {
		this.yuangong = yuangong;
	}

	public String getNeirong() {
		return this.neirong;
	}

	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}

}