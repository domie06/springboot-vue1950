package com.entity;

public class Kefangxinxi {
    private Integer id;
	private String kefangbianhao;	private String kefangleixing;	private String jiage;	private String zhuangtai;	
    private String addtime;

    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getKefangbianhao() {
        return kefangbianhao;
    }
    public void setKefangbianhao(String kefangbianhao) {
        this.kefangbianhao = kefangbianhao == null ? null : kefangbianhao.trim();
    }	public String getKefangleixing() {
        return kefangleixing;
    }
    public void setKefangleixing(String kefangleixing) {
        this.kefangleixing = kefangleixing == null ? null : kefangleixing.trim();
    }	public String getJiage() {
        return jiage;
    }
    public void setJiage(String jiage) {
        this.jiage = jiage == null ? null : jiage.trim();
    }	public String getZhuangtai() {
        return zhuangtai;
    }
    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai == null ? null : zhuangtai.trim();
    }	
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息
