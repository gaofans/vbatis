package com.gaofans.vbatis.core.pool;

import io.vertx.sqlclient.Pool;

@FunctionalInterface
public interface PoolFactory {

    Pool getPool();
}
