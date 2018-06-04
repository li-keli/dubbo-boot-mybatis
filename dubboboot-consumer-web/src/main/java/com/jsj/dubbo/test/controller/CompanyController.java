package com.jsj.dubbo.test.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jsj.dubbo.test.model.CompanyInfoTianyan;
import com.jsj.dubbo.test.service.CompanyService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
public class CompanyController {

    @Reference(version = "1.0.0")
    private CompanyService companyService;

    @ApiOperation(value = "企业详细信息", notes = "根据url的id来获取企业详细信息")
    @ApiImplicitParam(name = "id", value = "企业编号", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "company/{id}", method = RequestMethod.GET)
    public ResponseEntity<CompanyInfoTianyan> get(@PathVariable(value = "id") Integer id) {

        return ResponseEntity.ok(companyService.Get(id));
    }

    @ApiOperation(value = "企业列表", notes = "获取企业列表")
    @ApiImplicitParam(name = "limit", value = "前多少条记录", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "companys/{limit}/{offset}", method = RequestMethod.GET)
    public ResponseEntity<List<CompanyInfoTianyan>> list(@PathVariable(value = "limit") int limit, @PathVariable(value = "offset") int offset) {

        return ResponseEntity.ok(companyService.List(offset, limit));
    }

    @ApiIgnore
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String jsonTest() {
        return " hi you!";
    }
}
