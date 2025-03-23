package com.entity;

public class Lvkexinxi {
    private Integer id;
	private String lvkebianhao;	private String lvkexingming;	private String xingbie;	private String dianhua;	private String dizhi;	
    private String addtime;

    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getLvkebianhao() {
        return lvkebianhao;
    }
    public void setLvkebianhao(String lvkebianhao) {
        this.lvkebianhao = lvkebianhao == null ? null : lvkebianhao.trim();
    }	public String getLvkexingming() {
        return lvkexingming;
    }
    public void setLvkexingming(String lvkexingming) {
        this.lvkexingming = lvkexingming == null ? null : lvkexingming.trim();
    }	public String getXingbie() {
        return xingbie;
    }
    public void setXingbie(String xingbie) {
        this.xingbie = xingbie == null ? null : xingbie.trim();
    }	public String getDianhua() {
        return dianhua;
    }
    public void setDianhua(String dianhua) {
        this.dianhua = dianhua == null ? null : dianhua.trim();
    }	public String getDizhi() {
        return dizhi;
    }
    public void setDizhi(String dizhi) {
        this.dizhi = dizhi == null ? null : dizhi.trim();
    }	
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息
