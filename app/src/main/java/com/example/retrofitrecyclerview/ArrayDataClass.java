package com.example.retrofitrecyclerview;

import java.util.List;

public class ArrayDataClass {
    private List<ItemData> data;

    public List<ItemData> getData() {
        return data;
    }

    public void setData(List<ItemData> data) {
        this.data = data;
    }

    public ArrayDataClass(List<ItemData> data) {
        this.data = data;
    }

    public ArrayDataClass() {
    }
}
