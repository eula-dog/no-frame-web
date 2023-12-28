package com.frxxz.bean;

public class CatalogueBean {
    private int id;
    private String name;
    private int type;
    private int level;
    private String href;

    public CatalogueBean() {
    }

    public CatalogueBean(int id, String name, int type, int level,String href) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.href = href;
    }

    public CatalogueBean(String name, int type, int level, String href) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.href = href;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "CatalogueBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", href='" + href + '\'' +
                '}';
    }
}
