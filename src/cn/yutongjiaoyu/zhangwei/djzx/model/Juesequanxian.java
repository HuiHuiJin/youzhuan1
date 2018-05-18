package cn.yutongjiaoyu.zhangwei.djzx.model;

/**
 * Juesequanxian entity. @author MyEclipse Persistence Tools
 */

public class Juesequanxian implements java.io.Serializable {

	// Fields

	private Integer duiyingid;
	private Juese juese;
	private String caozuobiao;
	private String quanxian;

	// Constructors

	/** default constructor */
	public Juesequanxian() {
	}

	/** full constructor */
	public Juesequanxian(Juese juese, String caozuobiao, String quanxian) {
		this.juese = juese;
		this.caozuobiao = caozuobiao;
		this.quanxian = quanxian;
	}

	// Property accessors

	public Integer getDuiyingid() {
		return this.duiyingid;
	}

	public void setDuiyingid(Integer duiyingid) {
		this.duiyingid = duiyingid;
	}

	public Juese getJuese() {
		return this.juese;
	}

	public void setJuese(Juese juese) {
		this.juese = juese;
	}

	public String getCaozuobiao() {
		return this.caozuobiao;
	}

	public void setCaozuobiao(String caozuobiao) {
		this.caozuobiao = caozuobiao;
	}

	public String getQuanxian() {
		return this.quanxian;
	}

	public void setQuanxian(String quanxian) {
		this.quanxian = quanxian;
	}

}