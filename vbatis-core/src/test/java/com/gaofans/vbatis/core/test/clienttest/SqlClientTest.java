package com.gaofans.vbatis.core.test.clienttest;

import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.tracing.TracingPolicy;
import io.vertx.pgclient.PgConnectOptions;
import io.vertx.pgclient.PgPool;
import io.vertx.sqlclient.PoolOptions;
import io.vertx.sqlclient.SqlConnection;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

public class SqlClientTest {

    @Test
    public void pgTest() throws InterruptedException {
        PgConnectOptions options = new PgConnectOptions()
                .setDatabase("train_zb")
                .setPort(5432)
                .setHost("192.168.2.5")
                .setUser("postgres")
                .setPassword("123456")
                .setTracingPolicy(TracingPolicy.ALWAYS);

        PgPool client = PgPool.pool(options,new PoolOptions());
        CountDownLatch latch = new CountDownLatch(2);
        client.query("select * from sys_user").execute().onComplete(res -> {
           if (res.succeeded()){
               System.out.println(res.result());
           }else {
               res.cause().printStackTrace();
           }
            latch.countDown();
        });

        Future<SqlConnection> connection = client.getConnection();
        connection.onSuccess(sqlConnection -> {
            Context context = Vertx.currentContext();
            System.out.println(sqlConnection);
        }).compose(SqlConnection::begin).onSuccess(tx -> {
            System.out.println(tx);
            latch.countDown();
        });
        latch.await();
//        client.getConnection().onSuccess(SqlConnection::begin).onSuccess(sqlConnection -> {
//            sqlConnection.query("delete * from fixed_assets where id='asf'").execute();
//        }).onSuccess(sqlConnection -> {
//            sqlConnection.query("delete * from fixed_assets where id='asdf'").execute();
//
//        }).onSuccess(SqlConnection::)
    }
}
