package com.jsj.dubbo.test.mapper;

import com.jsj.dubbo.test.model.HotelInfo;
import com.jsj.dubbo.test.model.HotelInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotelInfoMapper {
    long countByExample(HotelInfoExample example);

    int deleteByExample(HotelInfoExample example);

    int insert(HotelInfo record);

    int insertSelective(HotelInfo record);

    List<HotelInfo> selectByExampleWithBLOBs(HotelInfoExample example);

    List<HotelInfo> selectByExample(HotelInfoExample example);

    int updateByExampleSelective(@Param("record") HotelInfo record, @Param("example") HotelInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") HotelInfo record, @Param("example") HotelInfoExample example);

    int updateByExample(@Param("record") HotelInfo record, @Param("example") HotelInfoExample example);
}