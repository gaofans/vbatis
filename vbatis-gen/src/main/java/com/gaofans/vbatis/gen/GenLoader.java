package com.gaofans.vbatis.gen;

import io.vertx.codegen.Generator;
import io.vertx.codegen.GeneratorLoader;

import javax.annotation.processing.ProcessingEnvironment;
import java.util.stream.Stream;

public class GenLoader implements GeneratorLoader {
    @Override
    public Stream<Generator<?>> loadGenerators(ProcessingEnvironment processingEnv) {
        return Stream.of(new MapperGen());
    }
}
