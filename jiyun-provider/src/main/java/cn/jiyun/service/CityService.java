package cn.jiyun.service;

import cn.jiyun.dao.CityDao;
import cn.jiyun.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService  {
@Autowired
    CityDao cityDao;
    public City findById(Integer id) {
        return cityDao.selectByPrimaryKey(id);
    }
}