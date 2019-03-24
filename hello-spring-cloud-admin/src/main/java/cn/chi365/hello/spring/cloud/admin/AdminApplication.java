package cn.chi365.hello.spring.cloud.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 * 服务监控springboot admin
 * 通过 @EnableAdminServer 注解开启 Admin 功能
 * @author      :YuSir Wang
 * @date        :Created in 10:19 2019/3/24
 * @version     :1.0.0
 */
@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class,args);
    }
}
