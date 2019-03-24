package cn.chi365.hello.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 * 分布式配置中心服务端
 * 通过 @EnableConfigServer 注解，开启配置服务器功能
 * @author      :YuSir Wang
 * @date        :Created in 18:39 2019/3/23
 * @version     :1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    }
}
