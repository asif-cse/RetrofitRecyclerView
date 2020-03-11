package com.example.retrofitrecyclerview;

import android.content.Context;

public class ItemData{
    private String resource;
    private String id;
    private String name;
    private String updated_at;

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpdate_at() {
        return updated_at;
    }

    public void setUpdate_at(String update_at) {
        this.updated_at = updated_at;
    }

    public ItemData() {
    }

    public ItemData(String resource, String id, String name, String updated_at) {
        this.resource = resource;
        this.id = id;
        this.name = name;
        this.updated_at = updated_at;
    }
}
