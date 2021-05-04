package com.guanggu.boot.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class MybatisConfig {

    //自定义mybatis的配置规则
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
       return new ConfigurationCustomizer(){
            @Override
            public void customize(Configuration configuration) {
                // 开启驼峰命名法规则,将以下划线方式命名的数据库列映射到Java对象的驼峰式命名属性
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
