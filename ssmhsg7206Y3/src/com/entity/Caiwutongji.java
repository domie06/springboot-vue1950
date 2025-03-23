package com.entity;

public class Caiwutongji {
    private Integer id;
	private String caiwubianhao;	private String caiwumingcheng;	private String caiwubaobiao;	private String shuoming;	
    private String addtime;

    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getCaiwubianhao() {
        return caiwubianhao;
    }
    public void setCaiwubianhao(String caiwubianhao) {
        this.caiwubianhao = caiwubianhao == null ? null : caiwubianhao.trim();
    }	public String getCaiwumingcheng() {
        return caiwumingcheng;
    }
    public void setCaiwumingcheng(String caiwumingcheng) {
        this.caiwumingcheng = caiwumingcheng == null ? null : caiwumingcheng.trim();
    }	public String getCaiwubaobiao() {
        return caiwubaobiao;
    }
    public void setCaiwubaobiao(String caiwubaobiao) {
        this.caiwubaobiao = caiwubaobiao == null ? null : caiwubaobiao.trim();
    }	public String getShuoming() {
        return shuoming;
    }
    public void setShuoming(String shuoming) {
        this.shuoming = shuoming == null ? null : shuoming.trim();
    }	
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息
