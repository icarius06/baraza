package com.walt.baraza.models;

public class BaseModel {
    private String createdAt, updatedAt, key, createdBy, updatedBy, modelName;

    public BaseModel() {
        setModelName("BaseModel");
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getKey() {
        return key;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean update() {
        return false;
    }

    public boolean save() {
        return false;
    }

    public boolean delete() {
        return false;
    }
}
