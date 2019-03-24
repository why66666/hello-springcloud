package cn.chi365.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/***
 * 创建测试用的 Service 在这里我们直接用的程序名替代了具体的 URL 地址，
 * 在 Ribbon 中它会根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的 URL 替换掉服务名
 * @author      :YuSir Wang
 * @date        :Created in 16:42 2019/3/21
 * @version     :
 */
@Service
public class AdminService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message){
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?message="+message,String.class);
    }

    public String hiError(String message){
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
