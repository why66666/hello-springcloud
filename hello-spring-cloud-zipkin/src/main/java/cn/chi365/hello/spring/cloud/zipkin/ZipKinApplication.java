package cn.chi365.hello.spring.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/***
 * zipkin服务链路追踪
 * 通过 @EnableZipkinServer 注解开启 Zipkin Server 功能
 * @author      :YuSir Wang
 * @date        :Created in 23:35 2019/3/23
 * @version     :
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class,args);
    }
}
