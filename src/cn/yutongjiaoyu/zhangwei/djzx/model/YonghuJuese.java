package cn.yutongjiaoyu.zhangwei.djzx.model;

/**
 * YonghuJuese entity. @author MyEclipse Persistence Tools
 */

public class YonghuJuese implements java.io.Serializable {

	// Fields

	private Integer duiyingid;
	private Yuangong yuangong;
	private Juese juese;

	// Constructors

	/** default constructor */
	public YonghuJuese() {
	}

	/** full constructor */
	public YonghuJuese(Yuangong yuangong, Juese juese) {
		this.yuangong = yuangong;
		this.juese = juese;
	}

	// Property accessors

	public Integer getDuiyingid() {
		return this.duiyingid;
	}

	public void setDuiyingid(Integer duiyingid) {
		this.duiyingid = duiyingid;
	}

	public Yuangong getYuangong() {
		return this.yuangong;
	}

	public void setYuangong(Yuangong yuangong) {
		this.yuangong = yuangong;
	}

	public Juese getJuese() {
		return this.juese;
	}

	public void setJuese(Juese juese) {
		this.juese = juese;
	}

}