package cn.jiyun.jiyunconsumer.feign;

import cn.jiyun.jiyunconsumer.entity.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "jiyun-provider",fallback = cityClientFallback.class)
public interface CityClient {
    @GetMapping("findById/{id}")
    public City findById(@PathVariable("id")Integer id);
}
