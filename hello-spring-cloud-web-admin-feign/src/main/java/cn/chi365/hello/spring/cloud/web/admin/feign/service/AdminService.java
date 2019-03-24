package cn.chi365.hello.spring.cloud.web.admin.feign.service;

import cn.chi365.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/***
 * 通过 @FeignClient("服务名") 注解来指定调用哪个服务。
 * @author      :YuSir Wang
 * @date        :Created in 17:10 2019/3/21
 * @version     :
 */
@FeignClient(value = "hello-spring-cloud-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "message") String message);
}
