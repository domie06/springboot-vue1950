package com.entity;

public class Jiezhang {
    private Integer id;
	private String kefangbianhao;	private String kefangleixing;	private String jiage;	private String lvkebianhao;	private String lvkexingming;	private String ruzhushijian;	private String ruzhutianshu;	private String zongjine;	
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
    }	public String getLvkebianhao() {
        return lvkebianhao;
    }
    public void setLvkebianhao(String lvkebianhao) {
        this.lvkebianhao = lvkebianhao == null ? null : lvkebianhao.trim();
    }	public String getLvkexingming() {
        return lvkexingming;
    }
    public void setLvkexingming(String lvkexingming) {
        this.lvkexingming = lvkexingming == null ? null : lvkexingming.trim();
    }	public String getRuzhushijian() {
        return ruzhushijian;
    }
    public void setRuzhushijian(String ruzhushijian) {
        this.ruzhushijian = ruzhushijian == null ? null : ruzhushijian.trim();
    }	public String getRuzhutianshu() {
        return ruzhutianshu;
    }
    public void setRuzhutianshu(String ruzhutianshu) {
        this.ruzhutianshu = ruzhutianshu == null ? null : ruzhutianshu.trim();
    }	public String getZongjine() {
        return zongjine;
    }
    public void setZongjine(String zongjine) {
        this.zongjine = zongjine == null ? null : zongjine.trim();
    }	
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息
