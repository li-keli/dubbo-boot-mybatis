package com.jsj.dubbo.test.mapper;

import com.jsj.dubbo.test.model.CompanyInfoTianyan;
import com.jsj.dubbo.test.model.CompanyInfoTianyanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyInfoTianyanMapper {
    long countByExample(CompanyInfoTianyanExample example);

    int deleteByExample(CompanyInfoTianyanExample example);

    int insert(CompanyInfoTianyan record);

    int insertSelective(CompanyInfoTianyan record);

    List<CompanyInfoTianyan> selectByExample(CompanyInfoTianyanExample example);

    int updateByExampleSelective(@Param("record") CompanyInfoTianyan record, @Param("example") CompanyInfoTianyanExample example);

    int updateByExample(@Param("record") CompanyInfoTianyan record, @Param("example") CompanyInfoTianyanExample example);
}