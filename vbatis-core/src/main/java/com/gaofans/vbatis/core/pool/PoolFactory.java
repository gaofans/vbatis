package com.gaofans.vbatis.core.pool;

import io.vertx.sqlclient.Pool;
import io.vertx.sqlclient.PoolOptions;
import io.vertx.sqlclient.SqlConnectOptions;

public interface PoolFactory {

    void setOptions(SqlConnectOptions connectionOptions, PoolOptions poolOptions);

    Pool getPool();
}
