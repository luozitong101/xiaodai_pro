package lzt.xiaodai.cn.entity;

public class TProject {
    private Integer id;

    private Integer infoid;

    private Integer authbankid;

    private Integer authmobileid;

    private Integer identityid;

    private Integer registerid;

    private Integer itemid;

    private String extends1;

    private Integer auditid;

    private String mobile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public Integer getAuthbankid() {
        return authbankid;
    }

    public void setAuthbankid(Integer authbankid) {
        this.authbankid = authbankid;
    }

    public Integer getAuthmobileid() {
        return authmobileid;
    }

    public void setAuthmobileid(Integer authmobileid) {
        this.authmobileid = authmobileid;
    }

    public Integer getIdentityid() {
        return identityid;
    }

    public void setIdentityid(Integer identityid) {
        this.identityid = identityid;
    }

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getExtends1() {
        return extends1;
    }

    public void setExtends1(String extends1) {
        this.extends1 = extends1 == null ? null : extends1.trim();
    }

    public Integer getAuditid() {
        return auditid;
    }

    public void setAuditid(Integer auditid) {
        this.auditid = auditid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }
}