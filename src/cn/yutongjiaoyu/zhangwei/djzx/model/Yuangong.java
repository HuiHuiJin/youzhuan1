package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Yuangong entity. @author MyEclipse Persistence Tools
 */

public class Yuangong implements java.io.Serializable {

	// Fields

	private Integer yuangongid;
	private Bumen bumen;
	private String yuangongming;
	private String shengri;
	private Boolean xingbie;
	private String zhengzhimianmao;
	private String ruzhishijian;
	private String beizhu;
	private String dengluming;
	private String denglumima;
	private Set ziduanjilus = new HashSet(0);
	private Set xinxisForFabuzhe = new HashSet(0);
	private Set yonghuJueses = new HashSet(0);
	private Set taolunqus = new HashSet(0);
	private Set yuangongrenwus = new HashSet(0);
	private Set yuangongzhaopians = new HashSet(0);
	private Set fuwujilus = new HashSet(0);
	private Set fuwushenbaos = new HashSet(0);
	private Set xinxisForShenheren = new HashSet(0);
	private Set shipinpingjias = new HashSet(0);

	// Constructors

	/** default constructor */
	public Yuangong() {
	}

	/** full constructor */
	public Yuangong(Bumen bumen, String yuangongming, String shengri,
			Boolean xingbie, String zhengzhimianmao, String ruzhishijian,
			String beizhu, String dengluming, String denglumima,
			Set ziduanjilus, Set xinxisForFabuzhe, Set yonghuJueses,
			Set taolunqus, Set yuangongrenwus, Set yuangongzhaopians,
			Set fuwujilus, Set fuwushenbaos, Set xinxisForShenheren,
			Set shipinpingjias) {
		this.bumen = bumen;
		this.yuangongming = yuangongming;
		this.shengri = shengri;
		this.xingbie = xingbie;
		this.zhengzhimianmao = zhengzhimianmao;
		this.ruzhishijian = ruzhishijian;
		this.beizhu = beizhu;
		this.dengluming = dengluming;
		this.denglumima = denglumima;
		this.ziduanjilus = ziduanjilus;
		this.xinxisForFabuzhe = xinxisForFabuzhe;
		this.yonghuJueses = yonghuJueses;
		this.taolunqus = taolunqus;
		this.yuangongrenwus = yuangongrenwus;
		this.yuangongzhaopians = yuangongzhaopians;
		this.fuwujilus = fuwujilus;
		this.fuwushenbaos = fuwushenbaos;
		this.xinxisForShenheren = xinxisForShenheren;
		this.shipinpingjias = shipinpingjias;
	}

	// Property accessors

	public Integer getYuangongid() {
		return this.yuangongid;
	}

	public void setYuangongid(Integer yuangongid) {
		this.yuangongid = yuangongid;
	}

	public Bumen getBumen() {
		return this.bumen;
	}

	public void setBumen(Bumen bumen) {
		this.bumen = bumen;
	}

	public String getYuangongming() {
		return this.yuangongming;
	}

	public void setYuangongming(String yuangongming) {
		this.yuangongming = yuangongming;
	}

	public String getShengri() {
		return this.shengri;
	}

	public void setShengri(String shengri) {
		this.shengri = shengri;
	}

	public Boolean getXingbie() {
		return this.xingbie;
	}

	public void setXingbie(Boolean xingbie) {
		this.xingbie = xingbie;
	}

	public String getZhengzhimianmao() {
		return this.zhengzhimianmao;
	}

	public void setZhengzhimianmao(String zhengzhimianmao) {
		this.zhengzhimianmao = zhengzhimianmao;
	}

	public String getRuzhishijian() {
		return this.ruzhishijian;
	}

	public void setRuzhishijian(String ruzhishijian) {
		this.ruzhishijian = ruzhishijian;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public String getDengluming() {
		return this.dengluming;
	}

	public void setDengluming(String dengluming) {
		this.dengluming = dengluming;
	}

	public String getDenglumima() {
		return this.denglumima;
	}

	public void setDenglumima(String denglumima) {
		this.denglumima = denglumima;
	}

	public Set getZiduanjilus() {
		return this.ziduanjilus;
	}

	public void setZiduanjilus(Set ziduanjilus) {
		this.ziduanjilus = ziduanjilus;
	}

	public Set getXinxisForFabuzhe() {
		return this.xinxisForFabuzhe;
	}

	public void setXinxisForFabuzhe(Set xinxisForFabuzhe) {
		this.xinxisForFabuzhe = xinxisForFabuzhe;
	}

	public Set getYonghuJueses() {
		return this.yonghuJueses;
	}

	public void setYonghuJueses(Set yonghuJueses) {
		this.yonghuJueses = yonghuJueses;
	}

	public Set getTaolunqus() {
		return this.taolunqus;
	}

	public void setTaolunqus(Set taolunqus) {
		this.taolunqus = taolunqus;
	}

	public Set getYuangongrenwus() {
		return this.yuangongrenwus;
	}

	public void setYuangongrenwus(Set yuangongrenwus) {
		this.yuangongrenwus = yuangongrenwus;
	}

	public Set getYuangongzhaopians() {
		return this.yuangongzhaopians;
	}

	public void setYuangongzhaopians(Set yuangongzhaopians) {
		this.yuangongzhaopians = yuangongzhaopians;
	}

	public Set getFuwujilus() {
		return this.fuwujilus;
	}

	public void setFuwujilus(Set fuwujilus) {
		this.fuwujilus = fuwujilus;
	}

	public Set getFuwushenbaos() {
		return this.fuwushenbaos;
	}

	public void setFuwushenbaos(Set fuwushenbaos) {
		this.fuwushenbaos = fuwushenbaos;
	}

	public Set getXinxisForShenheren() {
		return this.xinxisForShenheren;
	}

	public void setXinxisForShenheren(Set xinxisForShenheren) {
		this.xinxisForShenheren = xinxisForShenheren;
	}

	public Set getShipinpingjias() {
		return this.shipinpingjias;
	}

	public void setShipinpingjias(Set shipinpingjias) {
		this.shipinpingjias = shipinpingjias;
	}

}