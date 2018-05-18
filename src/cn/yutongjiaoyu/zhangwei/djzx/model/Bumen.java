package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.HashSet;
import java.util.Set;


/**
 * Bumen entity. @author MyEclipse Persistence Tools
 */

public class Bumen  implements java.io.Serializable {


    // Fields    

     private Integer bumenid;
     private String bumenming;
     private String bumenjieshao;
     private Set fuwushenbaos = new HashSet(0);
     private Set caijibiaos = new HashSet(0);
     private Set renwus = new HashSet(0);
     private Set yuangongs = new HashSet(0);


    // Constructors

    /** default constructor */
    public Bumen() {
    }

    
    /** full constructor */
    public Bumen(String bumenming, String bumenjieshao, Set fuwushenbaos, Set caijibiaos, Set renwus, Set yuangongs) {
        this.bumenming = bumenming;
        this.bumenjieshao = bumenjieshao;
        this.fuwushenbaos = fuwushenbaos;
        this.caijibiaos = caijibiaos;
        this.renwus = renwus;
        this.yuangongs = yuangongs;
    }

   
    // Property accessors

    public Integer getBumenid() {
        return this.bumenid;
    }
    
    public void setBumenid(Integer bumenid) {
        this.bumenid = bumenid;
    }

    public String getBumenming() {
        return this.bumenming;
    }
    
    public void setBumenming(String bumenming) {
        this.bumenming = bumenming;
    }

    public String getBumenjieshao() {
        return this.bumenjieshao;
    }
    
    public void setBumenjieshao(String bumenjieshao) {
        this.bumenjieshao = bumenjieshao;
    }

    public Set getFuwushenbaos() {
        return this.fuwushenbaos;
    }
    
    public void setFuwushenbaos(Set fuwushenbaos) {
        this.fuwushenbaos = fuwushenbaos;
    }

    public Set getCaijibiaos() {
        return this.caijibiaos;
    }
    
    public void setCaijibiaos(Set caijibiaos) {
        this.caijibiaos = caijibiaos;
    }

    public Set getRenwus() {
        return this.renwus;
    }
    
    public void setRenwus(Set renwus) {
        this.renwus = renwus;
    }

    public Set getYuangongs() {
        return this.yuangongs;
    }
    
    public void setYuangongs(Set yuangongs) {
        this.yuangongs = yuangongs;
    }
   








}