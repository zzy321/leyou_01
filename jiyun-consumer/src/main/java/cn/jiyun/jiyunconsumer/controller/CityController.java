package cn.jiyun.jiyunconsumer.controller;

import cn.jiyun.jiyunconsumer.entity.City;
import cn.jiyun.jiyunconsumer.feign.CityClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CityController {
@Autowired
    RestTemplate restTemplate;
@Autowired
    DiscoveryClient discoveryClient;
@Autowired
    CityClient cityClient;
    @GetMapping("findById/{id}")
    @HystrixCommand
    public City findById(@PathVariable("id")Integer id){

        /*  List<ServiceInstance> instances = discoveryClient.getInstances("jiyun-provider");
        ServiceInstance serviceInstance = instances.get(0);
        int port = serviceInstance.getPort();
        String host = serviceInstance.getHost();
        System.out.println(host+":"+port);
        return restTemplate.getForObject("http://"+host+":"+port+"/findById?id=" +id, City.class);*/
        if(id==2){
            throw new RuntimeException("出错啦");
        }
        return cityClient.findById(id);

    }


}
