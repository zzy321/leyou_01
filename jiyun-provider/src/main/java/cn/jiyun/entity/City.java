package cn.jiyun.entity;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * (City)实体类
 *
 * @author makejava
 * @since 2020-09-02 19:36:31
 */
public class City implements Serializable {
    private static final long serialVersionUID = -86472592984837779L;
    @Id
    private Integer cityId;

    private String cityName;

    private Integer parentId;


    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

}