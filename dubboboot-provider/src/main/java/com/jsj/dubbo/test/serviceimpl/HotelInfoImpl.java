package com.jsj.dubbo.test.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jsj.dubbo.test.mapper.HotelInfoMapper;
import com.jsj.dubbo.test.model.HotelInfo;
import com.jsj.dubbo.test.model.HotelInfoExample;
import com.jsj.dubbo.test.service.HotelInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class HotelInfoImpl implements HotelInfoService {

    @Autowired
    private HotelInfoMapper hotelInfoMapper;

    @Override
    public String Get() {
        return "hello world!";
    }

    @Override
    public List<HotelInfo> List() {
        System.out.println("hotelInfoMapper is " + (hotelInfoMapper == null));
        HotelInfoExample example = new HotelInfoExample();
        example.createCriteria().andIdBetween(1, 3);
        List<HotelInfo> hotelInfos = hotelInfoMapper.selectByExample(example);

        return hotelInfos;
    }
}
