package cn.jiyun.jiyunconsumer.feign;

import cn.jiyun.jiyunconsumer.entity.City;
import org.springframework.stereotype.Component;

@Component
public class cityClientFallback  implements CityClient{
    @Override
    public City findById(Integer id) {
        City city = new City();
        city.setCityName("访问错误，请联系管理员");
        return city;
    }
}
