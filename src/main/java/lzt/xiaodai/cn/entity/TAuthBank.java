package lzt.xiaodai.cn.entity;

public class TAuthBank {
    private Integer id;

    private String accountprovince;

    private String accountphone;

    private String accountbank;

    private String accountcard;

    private Integer status;

    private String extends1;

    private String extends2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountprovince() {
        return accountprovince;
    }

    public void setAccountprovince(String accountprovince) {
        this.accountprovince = accountprovince == null ? null : accountprovince.trim();
    }

    public String getAccountphone() {
        return accountphone;
    }

    public void setAccountphone(String accountphone) {
        this.accountphone = accountphone == null ? null : accountphone.trim();
    }

    public String getAccountbank() {
        return accountbank;
    }

    public void setAccountbank(String accountbank) {
        this.accountbank = accountbank == null ? null : accountbank.trim();
    }

    public String getAccountcard() {
        return accountcard;
    }

    public void setAccountcard(String accountcard) {
        this.accountcard = accountcard == null ? null : accountcard.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getExtends1() {
        return extends1;
    }

    public void setExtends1(String extends1) {
        this.extends1 = extends1 == null ? null : extends1.trim();
    }

    public String getExtends2() {
        return extends2;
    }

    public void setExtends2(String extends2) {
        this.extends2 = extends2 == null ? null : extends2.trim();
    }
}