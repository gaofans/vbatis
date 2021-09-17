package com.gaofans.vbatis.gen;

import io.vertx.codegen.CodeGenProcessor;
import io.vertx.codegen.Compiler;
import org.junit.Test;

public class GenTest {

    @Test
    public void genTest() throws Exception {
        Compiler compiler = new Compiler(new CodeGenProcessor());
        compiler.compile(User.class);
    }
}
