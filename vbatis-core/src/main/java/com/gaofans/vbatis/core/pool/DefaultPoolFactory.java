package com.gaofans.vbatis.core.pool;

import io.vertx.core.Vertx;
import io.vertx.sqlclient.Pool;
import io.vertx.sqlclient.PoolOptions;
import io.vertx.sqlclient.SqlConnectOptions;
import java.util.Objects;

public class DefaultPoolFactory implements PoolFactory {

    private final Pool pool;

    public DefaultPoolFactory(Vertx vertx,
                              SqlConnectOptions connectionOptions,
                              PoolOptions poolOptions) {
        this.pool = Pool.pool(Objects.requireNonNull(vertx),
                Objects.requireNonNull(connectionOptions),
                Objects.requireNonNull(poolOptions));
    }

    @Override
    public Pool getPool() {
        return pool;
    }
}
