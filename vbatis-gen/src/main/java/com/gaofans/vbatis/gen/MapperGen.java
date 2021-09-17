package com.gaofans.vbatis.gen;

import io.vertx.codegen.DataObjectModel;
import io.vertx.codegen.Generator;
import io.vertx.codegen.annotations.DataObject;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class MapperGen extends Generator<DataObjectModel> {

    public MapperGen() {
        this.kinds= Collections.singleton("dataObject");
        this.name="object_mapper";
    }
    @Override
    public Collection<Class<? extends Annotation>> annotations() {
        return Collections.singletonList(DataObject.class);
    }
    @Override
    public String filename(DataObjectModel model) {
        return "xxxx";
    }

    @Override
    public String render(DataObjectModel model, int index, int size, Map<String, Object> session) {
        return "1231231231";
    }
}
