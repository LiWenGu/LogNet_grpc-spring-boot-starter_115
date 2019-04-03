package com.liwenguang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author liwenguang
 * @Date 2019-04-03 23:58
 * @Description 
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@PropertySource(value={"file:/Users/liwenguang/SourceCode/Github/LogNet_grpc-spring-boot-starter_115/src/main/resources/ext.properties"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}

