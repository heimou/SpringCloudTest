package com.ideal.testdata.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author liyujie
 * @Description: 加载 druid 配置
 * @date 2017/12/8 10:55
 */
public class DruidConfig implements EnvironmentAware {

    /**
     * RelaxedPropertyResolver 获取yml 中的变量
     */
    private RelaxedPropertyResolver relaxedPropertyResolver;

    @Override
    public void setEnvironment(Environment env) {
        this.relaxedPropertyResolver = new RelaxedPropertyResolver(env, "spring.datasource.");
    }

    /**
     * 加载druid数据库连接池
     *
     * @return
     */
    @Bean
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(relaxedPropertyResolver.getProperty("driverClassName"));
        druidDataSource.setUrl(relaxedPropertyResolver.getProperty("url"));
        druidDataSource.setUsername(relaxedPropertyResolver.getProperty("username"));
        druidDataSource.setPassword(relaxedPropertyResolver.getProperty("password"));
        druidDataSource.setInitialSize(Integer.valueOf(relaxedPropertyResolver.getProperty("initialSize")));
        druidDataSource.setMinIdle(Integer.valueOf(relaxedPropertyResolver.getProperty("minIdle")));
        druidDataSource.setMaxActive(Integer.valueOf(relaxedPropertyResolver.getProperty("maxActive")));
        druidDataSource.setMaxWait(Long.valueOf(relaxedPropertyResolver.getProperty("maxWait")));
        druidDataSource.setTimeBetweenEvictionRunsMillis(Long.valueOf(relaxedPropertyResolver.getProperty("timeBetweenEvictionRunsMillis")));
        try {
            druidDataSource.setFilters("stat,wall");
            druidDataSource.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return druidDataSource;
    }
}
