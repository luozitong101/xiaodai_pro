package lzt.xiaodai.cn.entity;

public class TImage {
    private Integer id;

    private String frontUrl;

    private String backUrl;

    private String familyUrl;

    private String extends1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrontUrl() {
        return frontUrl;
    }

    public void setFrontUrl(String frontUrl) {
        this.frontUrl = frontUrl == null ? null : frontUrl.trim();
    }

    public String getBackUrl() {
        return backUrl;
    }

    public void setBackUrl(String backUrl) {
        this.backUrl = backUrl == null ? null : backUrl.trim();
    }

    public String getFamilyUrl() {
        return familyUrl;
    }

    public void setFamilyUrl(String familyUrl) {
        this.familyUrl = familyUrl == null ? null : familyUrl.trim();
    }

    public String getExtends1() {
        return extends1;
    }

    public void setExtends1(String extends1) {
        this.extends1 = extends1 == null ? null : extends1.trim();
    }
}