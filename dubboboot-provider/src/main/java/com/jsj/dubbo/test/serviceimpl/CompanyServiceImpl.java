package com.jsj.dubbo.test.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jsj.dubbo.test.mapper.CompanyInfoTianyanMapper;
import com.jsj.dubbo.test.model.CompanyInfoTianyan;
import com.jsj.dubbo.test.model.CompanyInfoTianyanExample;
import com.jsj.dubbo.test.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyInfoTianyanMapper mapper;

    @Override
    public CompanyInfoTianyan Get(Integer id) {
        CompanyInfoTianyanExample example = new CompanyInfoTianyanExample();
        example.createCriteria().andIdEqualTo(id);
        List<CompanyInfoTianyan> companyInfoTainan = mapper.selectByExample(example);

        if (companyInfoTainan.size() > 0) {
            return companyInfoTainan.get(0);
        } else {
            return null;
        }

    }

    @Override
    public List<CompanyInfoTianyan> List(int limit, int offset) {
        CompanyInfoTianyanExample example = new CompanyInfoTianyanExample();
        example.createCriteria().andIdBetween(limit, offset);

        return mapper.selectByExample(example);
    }
}