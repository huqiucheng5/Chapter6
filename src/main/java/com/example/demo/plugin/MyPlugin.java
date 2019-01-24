package com.example.demo.plugin;


import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;

import java.sql.Connection;
import java.util.Properties;

/**
 * Created by Administrator on 2019/1/24.
 */
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare",
        args = {Connection.class, Integer.class})})
public class MyPlugin implements Interceptor {

    Properties properties = null;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("intercept....");
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object o) {
        System.out.println("plugin....");
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
