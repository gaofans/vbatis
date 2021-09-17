package com.gaofans.vbatis.gen;

import io.vertx.codegen.annotations.DataObject;

@DataObject
public class User {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
