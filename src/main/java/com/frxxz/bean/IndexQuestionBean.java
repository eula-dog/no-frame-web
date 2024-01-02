package com.frxxz.bean;

public class IndexQuestionBean {
    private int id;
    private String name;
    private String description;
    private String datetime;

    public IndexQuestionBean() {
    }

    public IndexQuestionBean(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public IndexQuestionBean(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public IndexQuestionBean(int id, String name, String description, String datetime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.datetime = datetime;
    }

    public IndexQuestionBean(String name, String description, String datetime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.datetime = datetime;
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

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "IndexQuestionBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", datetime='" + datetime + '\'' +
                '}';
    }
}
