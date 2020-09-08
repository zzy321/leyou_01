package cn.jiyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan({"cn.jiyun.dao"})
@EnableDiscoveryClient

public class JiyunProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiyunProviderApplication.class, args);
    }

}
