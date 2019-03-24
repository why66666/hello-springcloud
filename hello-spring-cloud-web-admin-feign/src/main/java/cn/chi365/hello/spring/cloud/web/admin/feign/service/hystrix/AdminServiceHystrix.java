package cn.chi365.hello.spring.cloud.web.admin.feign.service.hystrix;

import cn.chi365.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/***
 * 熔断器类
 * @author      :YuSir Wang
 * @date        :Created in 21:04 2019/3/21
 * @version     :
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        System.out.println("----------------Hi，your message is :" + message + " but request error.-------------------");
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
