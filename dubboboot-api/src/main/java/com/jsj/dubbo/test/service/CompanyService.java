package com.jsj.dubbo.test.service;

import com.jsj.dubbo.test.model.CompanyInfoTianyan;

import java.util.List;

public interface CompanyService {

    CompanyInfoTianyan Get(Integer id);

    List<CompanyInfoTianyan> List(int limit, int offset);
}
