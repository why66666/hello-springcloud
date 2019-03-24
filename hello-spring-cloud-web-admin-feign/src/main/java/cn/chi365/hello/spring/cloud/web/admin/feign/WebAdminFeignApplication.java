package cn.chi365.hello.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/***
 * 通过 @EnableFeignClients 注解开启 Feign 功能
 * @author      :YuSir Wang
 * @date        :Created in 17:05 2019/3/21
 * @version     :
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrixDashboard
public class WebAdminFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeignApplication.class,args);
    }
}
