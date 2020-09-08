package cn.jiyun.controller;

import cn.jiyun.entity.City;
import cn.jiyun.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
  @Autowired
    CityService cityService;
  @GetMapping("findById/{id}")
  public City findById(@PathVariable("id")Integer id){
    return cityService.findById(id);
    }


}
