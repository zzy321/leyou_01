package cn.jiyun.jiyunconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*@SpringBootApplication
@EnableDiscoveryClient*/
@EnableFeignClients
@SpringCloudApplication
public class JiyunConsumerApplication {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(JiyunConsumerApplication.class, args);
    }

}
