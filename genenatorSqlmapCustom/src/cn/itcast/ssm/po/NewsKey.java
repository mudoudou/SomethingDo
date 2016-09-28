package cn.itcast.ssm.po;

public class NewsKey {
    private String id;

    private Boolean haspic;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Boolean getHaspic() {
        return haspic;
    }

    public void setHaspic(Boolean haspic) {
        this.haspic = haspic;
    }
}