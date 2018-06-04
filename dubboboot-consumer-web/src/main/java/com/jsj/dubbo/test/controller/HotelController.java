package com.jsj.dubbo.test.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jsj.dubbo.test.model.HotelInfo;
import com.jsj.dubbo.test.service.HotelInfoService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    @Reference(version = "1.0.0")
    private HotelInfoService service;

    @ApiOperation(value = "酒店详细信息", notes = "根据url的id来获取酒店详细信息")
    @RequestMapping(value = "hotel", method = RequestMethod.GET)
    public String get() {
        return service.Get();
    }

    @ApiOperation(value = "酒店列表", notes = "根据url的id来获取酒店详细信息")
    @RequestMapping(value = "hotels", method = RequestMethod.GET)
    public List<HotelInfo> list() {
        return service.List();
    }

}
