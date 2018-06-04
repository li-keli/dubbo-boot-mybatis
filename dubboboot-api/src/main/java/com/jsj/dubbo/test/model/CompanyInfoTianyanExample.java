package com.jsj.dubbo.test.model;

import java.util.ArrayList;
import java.util.List;

public class CompanyInfoTianyanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyInfoTianyanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andLianxiDianhuaIsNull() {
            addCriterion("lianxi_dianhua is null");
            return (Criteria) this;
        }

        public Criteria andLianxiDianhuaIsNotNull() {
            addCriterion("lianxi_dianhua is not null");
            return (Criteria) this;
        }

        public Criteria andLianxiDianhuaEqualTo(String value) {
            addCriterion("lianxi_dianhua =", value, "lianxiDianhua");
            return (Criteria) this;
        }

        public Criteria andLianxiDianhuaNotEqualTo(String value) {
            addCriterion("lianxi_dianhua <>", value, "lianxiDianhua");
            return (Criteria) this;
        }

        public Criteria andLianxiDianhuaGreaterThan(String value) {
            addCriterion("lianxi_dianhua >", value, "lianxiDianhua");
            return (Criteria) this;
        }

        public Criteria andLianxiDianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("lianxi_dianhua >=", value, "lianxiDianhua");
            return (Criteria) this;
        }

        public Criteria andLianxiDianhuaLessThan(String value) {
            addCriterion("lianxi_dianhua <", value, "lianxiDianhua");
            return (Criteria) this;
        }

        public Criteria andLianxiDianhuaLessThanOrEqualTo(String value) {
            addCriterion("lianxi_dianhua <=", value, "lianxiDianhua");
            return (Criteria) this;
        }

        public Criteria andLianxiDianhuaLike(String value) {
            addCriterion("lianxi_dianhua like", value, "lianxiDianhua");
            return (Criteria) this;
        }

        public Criteria andLianxiDianhuaNotLike(String value) {
            addCriterion("lianxi_dianhua not like", value, "lianxiDianhua");
            return (Criteria) this;
        }

        public Criteria andLianxiDianhuaIn(List<String> values) {
            addCriterion("lianxi_dianhua in", values, "lianxiDianhua");
            return (Criteria) this;
        }

        public Criteria andLianxiDianhuaNotIn(List<String> values) {
            addCriterion("lianxi_dianhua not in", values, "lianxiDianhua");
            return (Criteria) this;
        }

        public Criteria andLianxiDianhuaBetween(String value1, String value2) {
            addCriterion("lianxi_dianhua between", value1, value2, "lianxiDianhua");
            return (Criteria) this;
        }

        public Criteria andLianxiDianhuaNotBetween(String value1, String value2) {
            addCriterion("lianxi_dianhua not between", value1, value2, "lianxiDianhua");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("e_mail is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("e_mail is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("e_mail =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("e_mail <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("e_mail >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("e_mail >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("e_mail <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("e_mail <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("e_mail like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("e_mail not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("e_mail in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("e_mail not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("e_mail between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("e_mail not between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andWebAddressIsNull() {
            addCriterion("web_address is null");
            return (Criteria) this;
        }

        public Criteria andWebAddressIsNotNull() {
            addCriterion("web_address is not null");
            return (Criteria) this;
        }

        public Criteria andWebAddressEqualTo(String value) {
            addCriterion("web_address =", value, "webAddress");
            return (Criteria) this;
        }

        public Criteria andWebAddressNotEqualTo(String value) {
            addCriterion("web_address <>", value, "webAddress");
            return (Criteria) this;
        }

        public Criteria andWebAddressGreaterThan(String value) {
            addCriterion("web_address >", value, "webAddress");
            return (Criteria) this;
        }

        public Criteria andWebAddressGreaterThanOrEqualTo(String value) {
            addCriterion("web_address >=", value, "webAddress");
            return (Criteria) this;
        }

        public Criteria andWebAddressLessThan(String value) {
            addCriterion("web_address <", value, "webAddress");
            return (Criteria) this;
        }

        public Criteria andWebAddressLessThanOrEqualTo(String value) {
            addCriterion("web_address <=", value, "webAddress");
            return (Criteria) this;
        }

        public Criteria andWebAddressLike(String value) {
            addCriterion("web_address like", value, "webAddress");
            return (Criteria) this;
        }

        public Criteria andWebAddressNotLike(String value) {
            addCriterion("web_address not like", value, "webAddress");
            return (Criteria) this;
        }

        public Criteria andWebAddressIn(List<String> values) {
            addCriterion("web_address in", values, "webAddress");
            return (Criteria) this;
        }

        public Criteria andWebAddressNotIn(List<String> values) {
            addCriterion("web_address not in", values, "webAddress");
            return (Criteria) this;
        }

        public Criteria andWebAddressBetween(String value1, String value2) {
            addCriterion("web_address between", value1, value2, "webAddress");
            return (Criteria) this;
        }

        public Criteria andWebAddressNotBetween(String value1, String value2) {
            addCriterion("web_address not between", value1, value2, "webAddress");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andFarenNameIsNull() {
            addCriterion("faren_name is null");
            return (Criteria) this;
        }

        public Criteria andFarenNameIsNotNull() {
            addCriterion("faren_name is not null");
            return (Criteria) this;
        }

        public Criteria andFarenNameEqualTo(String value) {
            addCriterion("faren_name =", value, "farenName");
            return (Criteria) this;
        }

        public Criteria andFarenNameNotEqualTo(String value) {
            addCriterion("faren_name <>", value, "farenName");
            return (Criteria) this;
        }

        public Criteria andFarenNameGreaterThan(String value) {
            addCriterion("faren_name >", value, "farenName");
            return (Criteria) this;
        }

        public Criteria andFarenNameGreaterThanOrEqualTo(String value) {
            addCriterion("faren_name >=", value, "farenName");
            return (Criteria) this;
        }

        public Criteria andFarenNameLessThan(String value) {
            addCriterion("faren_name <", value, "farenName");
            return (Criteria) this;
        }

        public Criteria andFarenNameLessThanOrEqualTo(String value) {
            addCriterion("faren_name <=", value, "farenName");
            return (Criteria) this;
        }

        public Criteria andFarenNameLike(String value) {
            addCriterion("faren_name like", value, "farenName");
            return (Criteria) this;
        }

        public Criteria andFarenNameNotLike(String value) {
            addCriterion("faren_name not like", value, "farenName");
            return (Criteria) this;
        }

        public Criteria andFarenNameIn(List<String> values) {
            addCriterion("faren_name in", values, "farenName");
            return (Criteria) this;
        }

        public Criteria andFarenNameNotIn(List<String> values) {
            addCriterion("faren_name not in", values, "farenName");
            return (Criteria) this;
        }

        public Criteria andFarenNameBetween(String value1, String value2) {
            addCriterion("faren_name between", value1, value2, "farenName");
            return (Criteria) this;
        }

        public Criteria andFarenNameNotBetween(String value1, String value2) {
            addCriterion("faren_name not between", value1, value2, "farenName");
            return (Criteria) this;
        }

        public Criteria andZhuceZibenIsNull() {
            addCriterion("zhuce_ziben is null");
            return (Criteria) this;
        }

        public Criteria andZhuceZibenIsNotNull() {
            addCriterion("zhuce_ziben is not null");
            return (Criteria) this;
        }

        public Criteria andZhuceZibenEqualTo(String value) {
            addCriterion("zhuce_ziben =", value, "zhuceZiben");
            return (Criteria) this;
        }

        public Criteria andZhuceZibenNotEqualTo(String value) {
            addCriterion("zhuce_ziben <>", value, "zhuceZiben");
            return (Criteria) this;
        }

        public Criteria andZhuceZibenGreaterThan(String value) {
            addCriterion("zhuce_ziben >", value, "zhuceZiben");
            return (Criteria) this;
        }

        public Criteria andZhuceZibenGreaterThanOrEqualTo(String value) {
            addCriterion("zhuce_ziben >=", value, "zhuceZiben");
            return (Criteria) this;
        }

        public Criteria andZhuceZibenLessThan(String value) {
            addCriterion("zhuce_ziben <", value, "zhuceZiben");
            return (Criteria) this;
        }

        public Criteria andZhuceZibenLessThanOrEqualTo(String value) {
            addCriterion("zhuce_ziben <=", value, "zhuceZiben");
            return (Criteria) this;
        }

        public Criteria andZhuceZibenLike(String value) {
            addCriterion("zhuce_ziben like", value, "zhuceZiben");
            return (Criteria) this;
        }

        public Criteria andZhuceZibenNotLike(String value) {
            addCriterion("zhuce_ziben not like", value, "zhuceZiben");
            return (Criteria) this;
        }

        public Criteria andZhuceZibenIn(List<String> values) {
            addCriterion("zhuce_ziben in", values, "zhuceZiben");
            return (Criteria) this;
        }

        public Criteria andZhuceZibenNotIn(List<String> values) {
            addCriterion("zhuce_ziben not in", values, "zhuceZiben");
            return (Criteria) this;
        }

        public Criteria andZhuceZibenBetween(String value1, String value2) {
            addCriterion("zhuce_ziben between", value1, value2, "zhuceZiben");
            return (Criteria) this;
        }

        public Criteria andZhuceZibenNotBetween(String value1, String value2) {
            addCriterion("zhuce_ziben not between", value1, value2, "zhuceZiben");
            return (Criteria) this;
        }

        public Criteria andZhuceShijianIsNull() {
            addCriterion("zhuce_shijian is null");
            return (Criteria) this;
        }

        public Criteria andZhuceShijianIsNotNull() {
            addCriterion("zhuce_shijian is not null");
            return (Criteria) this;
        }

        public Criteria andZhuceShijianEqualTo(String value) {
            addCriterion("zhuce_shijian =", value, "zhuceShijian");
            return (Criteria) this;
        }

        public Criteria andZhuceShijianNotEqualTo(String value) {
            addCriterion("zhuce_shijian <>", value, "zhuceShijian");
            return (Criteria) this;
        }

        public Criteria andZhuceShijianGreaterThan(String value) {
            addCriterion("zhuce_shijian >", value, "zhuceShijian");
            return (Criteria) this;
        }

        public Criteria andZhuceShijianGreaterThanOrEqualTo(String value) {
            addCriterion("zhuce_shijian >=", value, "zhuceShijian");
            return (Criteria) this;
        }

        public Criteria andZhuceShijianLessThan(String value) {
            addCriterion("zhuce_shijian <", value, "zhuceShijian");
            return (Criteria) this;
        }

        public Criteria andZhuceShijianLessThanOrEqualTo(String value) {
            addCriterion("zhuce_shijian <=", value, "zhuceShijian");
            return (Criteria) this;
        }

        public Criteria andZhuceShijianLike(String value) {
            addCriterion("zhuce_shijian like", value, "zhuceShijian");
            return (Criteria) this;
        }

        public Criteria andZhuceShijianNotLike(String value) {
            addCriterion("zhuce_shijian not like", value, "zhuceShijian");
            return (Criteria) this;
        }

        public Criteria andZhuceShijianIn(List<String> values) {
            addCriterion("zhuce_shijian in", values, "zhuceShijian");
            return (Criteria) this;
        }

        public Criteria andZhuceShijianNotIn(List<String> values) {
            addCriterion("zhuce_shijian not in", values, "zhuceShijian");
            return (Criteria) this;
        }

        public Criteria andZhuceShijianBetween(String value1, String value2) {
            addCriterion("zhuce_shijian between", value1, value2, "zhuceShijian");
            return (Criteria) this;
        }

        public Criteria andZhuceShijianNotBetween(String value1, String value2) {
            addCriterion("zhuce_shijian not between", value1, value2, "zhuceShijian");
            return (Criteria) this;
        }

        public Criteria andJingyingZhuangtaiIsNull() {
            addCriterion("jingying_zhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andJingyingZhuangtaiIsNotNull() {
            addCriterion("jingying_zhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andJingyingZhuangtaiEqualTo(String value) {
            addCriterion("jingying_zhuangtai =", value, "jingyingZhuangtai");
            return (Criteria) this;
        }

        public Criteria andJingyingZhuangtaiNotEqualTo(String value) {
            addCriterion("jingying_zhuangtai <>", value, "jingyingZhuangtai");
            return (Criteria) this;
        }

        public Criteria andJingyingZhuangtaiGreaterThan(String value) {
            addCriterion("jingying_zhuangtai >", value, "jingyingZhuangtai");
            return (Criteria) this;
        }

        public Criteria andJingyingZhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("jingying_zhuangtai >=", value, "jingyingZhuangtai");
            return (Criteria) this;
        }

        public Criteria andJingyingZhuangtaiLessThan(String value) {
            addCriterion("jingying_zhuangtai <", value, "jingyingZhuangtai");
            return (Criteria) this;
        }

        public Criteria andJingyingZhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("jingying_zhuangtai <=", value, "jingyingZhuangtai");
            return (Criteria) this;
        }

        public Criteria andJingyingZhuangtaiLike(String value) {
            addCriterion("jingying_zhuangtai like", value, "jingyingZhuangtai");
            return (Criteria) this;
        }

        public Criteria andJingyingZhuangtaiNotLike(String value) {
            addCriterion("jingying_zhuangtai not like", value, "jingyingZhuangtai");
            return (Criteria) this;
        }

        public Criteria andJingyingZhuangtaiIn(List<String> values) {
            addCriterion("jingying_zhuangtai in", values, "jingyingZhuangtai");
            return (Criteria) this;
        }

        public Criteria andJingyingZhuangtaiNotIn(List<String> values) {
            addCriterion("jingying_zhuangtai not in", values, "jingyingZhuangtai");
            return (Criteria) this;
        }

        public Criteria andJingyingZhuangtaiBetween(String value1, String value2) {
            addCriterion("jingying_zhuangtai between", value1, value2, "jingyingZhuangtai");
            return (Criteria) this;
        }

        public Criteria andJingyingZhuangtaiNotBetween(String value1, String value2) {
            addCriterion("jingying_zhuangtai not between", value1, value2, "jingyingZhuangtai");
            return (Criteria) this;
        }

        public Criteria andHangyeIsNull() {
            addCriterion("hangye is null");
            return (Criteria) this;
        }

        public Criteria andHangyeIsNotNull() {
            addCriterion("hangye is not null");
            return (Criteria) this;
        }

        public Criteria andHangyeEqualTo(String value) {
            addCriterion("hangye =", value, "hangye");
            return (Criteria) this;
        }

        public Criteria andHangyeNotEqualTo(String value) {
            addCriterion("hangye <>", value, "hangye");
            return (Criteria) this;
        }

        public Criteria andHangyeGreaterThan(String value) {
            addCriterion("hangye >", value, "hangye");
            return (Criteria) this;
        }

        public Criteria andHangyeGreaterThanOrEqualTo(String value) {
            addCriterion("hangye >=", value, "hangye");
            return (Criteria) this;
        }

        public Criteria andHangyeLessThan(String value) {
            addCriterion("hangye <", value, "hangye");
            return (Criteria) this;
        }

        public Criteria andHangyeLessThanOrEqualTo(String value) {
            addCriterion("hangye <=", value, "hangye");
            return (Criteria) this;
        }

        public Criteria andHangyeLike(String value) {
            addCriterion("hangye like", value, "hangye");
            return (Criteria) this;
        }

        public Criteria andHangyeNotLike(String value) {
            addCriterion("hangye not like", value, "hangye");
            return (Criteria) this;
        }

        public Criteria andHangyeIn(List<String> values) {
            addCriterion("hangye in", values, "hangye");
            return (Criteria) this;
        }

        public Criteria andHangyeNotIn(List<String> values) {
            addCriterion("hangye not in", values, "hangye");
            return (Criteria) this;
        }

        public Criteria andHangyeBetween(String value1, String value2) {
            addCriterion("hangye between", value1, value2, "hangye");
            return (Criteria) this;
        }

        public Criteria andHangyeNotBetween(String value1, String value2) {
            addCriterion("hangye not between", value1, value2, "hangye");
            return (Criteria) this;
        }

        public Criteria andQiyeleixingIsNull() {
            addCriterion("qiyeleixing is null");
            return (Criteria) this;
        }

        public Criteria andQiyeleixingIsNotNull() {
            addCriterion("qiyeleixing is not null");
            return (Criteria) this;
        }

        public Criteria andQiyeleixingEqualTo(String value) {
            addCriterion("qiyeleixing =", value, "qiyeleixing");
            return (Criteria) this;
        }

        public Criteria andQiyeleixingNotEqualTo(String value) {
            addCriterion("qiyeleixing <>", value, "qiyeleixing");
            return (Criteria) this;
        }

        public Criteria andQiyeleixingGreaterThan(String value) {
            addCriterion("qiyeleixing >", value, "qiyeleixing");
            return (Criteria) this;
        }

        public Criteria andQiyeleixingGreaterThanOrEqualTo(String value) {
            addCriterion("qiyeleixing >=", value, "qiyeleixing");
            return (Criteria) this;
        }

        public Criteria andQiyeleixingLessThan(String value) {
            addCriterion("qiyeleixing <", value, "qiyeleixing");
            return (Criteria) this;
        }

        public Criteria andQiyeleixingLessThanOrEqualTo(String value) {
            addCriterion("qiyeleixing <=", value, "qiyeleixing");
            return (Criteria) this;
        }

        public Criteria andQiyeleixingLike(String value) {
            addCriterion("qiyeleixing like", value, "qiyeleixing");
            return (Criteria) this;
        }

        public Criteria andQiyeleixingNotLike(String value) {
            addCriterion("qiyeleixing not like", value, "qiyeleixing");
            return (Criteria) this;
        }

        public Criteria andQiyeleixingIn(List<String> values) {
            addCriterion("qiyeleixing in", values, "qiyeleixing");
            return (Criteria) this;
        }

        public Criteria andQiyeleixingNotIn(List<String> values) {
            addCriterion("qiyeleixing not in", values, "qiyeleixing");
            return (Criteria) this;
        }

        public Criteria andQiyeleixingBetween(String value1, String value2) {
            addCriterion("qiyeleixing between", value1, value2, "qiyeleixing");
            return (Criteria) this;
        }

        public Criteria andQiyeleixingNotBetween(String value1, String value2) {
            addCriterion("qiyeleixing not between", value1, value2, "qiyeleixing");
            return (Criteria) this;
        }

        public Criteria andGongshangZhucehaoIsNull() {
            addCriterion("gongshang_zhucehao is null");
            return (Criteria) this;
        }

        public Criteria andGongshangZhucehaoIsNotNull() {
            addCriterion("gongshang_zhucehao is not null");
            return (Criteria) this;
        }

        public Criteria andGongshangZhucehaoEqualTo(String value) {
            addCriterion("gongshang_zhucehao =", value, "gongshangZhucehao");
            return (Criteria) this;
        }

        public Criteria andGongshangZhucehaoNotEqualTo(String value) {
            addCriterion("gongshang_zhucehao <>", value, "gongshangZhucehao");
            return (Criteria) this;
        }

        public Criteria andGongshangZhucehaoGreaterThan(String value) {
            addCriterion("gongshang_zhucehao >", value, "gongshangZhucehao");
            return (Criteria) this;
        }

        public Criteria andGongshangZhucehaoGreaterThanOrEqualTo(String value) {
            addCriterion("gongshang_zhucehao >=", value, "gongshangZhucehao");
            return (Criteria) this;
        }

        public Criteria andGongshangZhucehaoLessThan(String value) {
            addCriterion("gongshang_zhucehao <", value, "gongshangZhucehao");
            return (Criteria) this;
        }

        public Criteria andGongshangZhucehaoLessThanOrEqualTo(String value) {
            addCriterion("gongshang_zhucehao <=", value, "gongshangZhucehao");
            return (Criteria) this;
        }

        public Criteria andGongshangZhucehaoLike(String value) {
            addCriterion("gongshang_zhucehao like", value, "gongshangZhucehao");
            return (Criteria) this;
        }

        public Criteria andGongshangZhucehaoNotLike(String value) {
            addCriterion("gongshang_zhucehao not like", value, "gongshangZhucehao");
            return (Criteria) this;
        }

        public Criteria andGongshangZhucehaoIn(List<String> values) {
            addCriterion("gongshang_zhucehao in", values, "gongshangZhucehao");
            return (Criteria) this;
        }

        public Criteria andGongshangZhucehaoNotIn(List<String> values) {
            addCriterion("gongshang_zhucehao not in", values, "gongshangZhucehao");
            return (Criteria) this;
        }

        public Criteria andGongshangZhucehaoBetween(String value1, String value2) {
            addCriterion("gongshang_zhucehao between", value1, value2, "gongshangZhucehao");
            return (Criteria) this;
        }

        public Criteria andGongshangZhucehaoNotBetween(String value1, String value2) {
            addCriterion("gongshang_zhucehao not between", value1, value2, "gongshangZhucehao");
            return (Criteria) this;
        }

        public Criteria andZuzhijigouDaimaIsNull() {
            addCriterion("zuzhijigou_daima is null");
            return (Criteria) this;
        }

        public Criteria andZuzhijigouDaimaIsNotNull() {
            addCriterion("zuzhijigou_daima is not null");
            return (Criteria) this;
        }

        public Criteria andZuzhijigouDaimaEqualTo(String value) {
            addCriterion("zuzhijigou_daima =", value, "zuzhijigouDaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigouDaimaNotEqualTo(String value) {
            addCriterion("zuzhijigou_daima <>", value, "zuzhijigouDaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigouDaimaGreaterThan(String value) {
            addCriterion("zuzhijigou_daima >", value, "zuzhijigouDaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigouDaimaGreaterThanOrEqualTo(String value) {
            addCriterion("zuzhijigou_daima >=", value, "zuzhijigouDaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigouDaimaLessThan(String value) {
            addCriterion("zuzhijigou_daima <", value, "zuzhijigouDaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigouDaimaLessThanOrEqualTo(String value) {
            addCriterion("zuzhijigou_daima <=", value, "zuzhijigouDaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigouDaimaLike(String value) {
            addCriterion("zuzhijigou_daima like", value, "zuzhijigouDaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigouDaimaNotLike(String value) {
            addCriterion("zuzhijigou_daima not like", value, "zuzhijigouDaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigouDaimaIn(List<String> values) {
            addCriterion("zuzhijigou_daima in", values, "zuzhijigouDaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigouDaimaNotIn(List<String> values) {
            addCriterion("zuzhijigou_daima not in", values, "zuzhijigouDaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigouDaimaBetween(String value1, String value2) {
            addCriterion("zuzhijigou_daima between", value1, value2, "zuzhijigouDaima");
            return (Criteria) this;
        }

        public Criteria andZuzhijigouDaimaNotBetween(String value1, String value2) {
            addCriterion("zuzhijigou_daima not between", value1, value2, "zuzhijigouDaima");
            return (Criteria) this;
        }

        public Criteria andTongyixinyongDaimaIsNull() {
            addCriterion("tongyixinyong_daima is null");
            return (Criteria) this;
        }

        public Criteria andTongyixinyongDaimaIsNotNull() {
            addCriterion("tongyixinyong_daima is not null");
            return (Criteria) this;
        }

        public Criteria andTongyixinyongDaimaEqualTo(String value) {
            addCriterion("tongyixinyong_daima =", value, "tongyixinyongDaima");
            return (Criteria) this;
        }

        public Criteria andTongyixinyongDaimaNotEqualTo(String value) {
            addCriterion("tongyixinyong_daima <>", value, "tongyixinyongDaima");
            return (Criteria) this;
        }

        public Criteria andTongyixinyongDaimaGreaterThan(String value) {
            addCriterion("tongyixinyong_daima >", value, "tongyixinyongDaima");
            return (Criteria) this;
        }

        public Criteria andTongyixinyongDaimaGreaterThanOrEqualTo(String value) {
            addCriterion("tongyixinyong_daima >=", value, "tongyixinyongDaima");
            return (Criteria) this;
        }

        public Criteria andTongyixinyongDaimaLessThan(String value) {
            addCriterion("tongyixinyong_daima <", value, "tongyixinyongDaima");
            return (Criteria) this;
        }

        public Criteria andTongyixinyongDaimaLessThanOrEqualTo(String value) {
            addCriterion("tongyixinyong_daima <=", value, "tongyixinyongDaima");
            return (Criteria) this;
        }

        public Criteria andTongyixinyongDaimaLike(String value) {
            addCriterion("tongyixinyong_daima like", value, "tongyixinyongDaima");
            return (Criteria) this;
        }

        public Criteria andTongyixinyongDaimaNotLike(String value) {
            addCriterion("tongyixinyong_daima not like", value, "tongyixinyongDaima");
            return (Criteria) this;
        }

        public Criteria andTongyixinyongDaimaIn(List<String> values) {
            addCriterion("tongyixinyong_daima in", values, "tongyixinyongDaima");
            return (Criteria) this;
        }

        public Criteria andTongyixinyongDaimaNotIn(List<String> values) {
            addCriterion("tongyixinyong_daima not in", values, "tongyixinyongDaima");
            return (Criteria) this;
        }

        public Criteria andTongyixinyongDaimaBetween(String value1, String value2) {
            addCriterion("tongyixinyong_daima between", value1, value2, "tongyixinyongDaima");
            return (Criteria) this;
        }

        public Criteria andTongyixinyongDaimaNotBetween(String value1, String value2) {
            addCriterion("tongyixinyong_daima not between", value1, value2, "tongyixinyongDaima");
            return (Criteria) this;
        }

        public Criteria andNashuirenShibiehaoIsNull() {
            addCriterion("nashuiren_shibiehao is null");
            return (Criteria) this;
        }

        public Criteria andNashuirenShibiehaoIsNotNull() {
            addCriterion("nashuiren_shibiehao is not null");
            return (Criteria) this;
        }

        public Criteria andNashuirenShibiehaoEqualTo(String value) {
            addCriterion("nashuiren_shibiehao =", value, "nashuirenShibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenShibiehaoNotEqualTo(String value) {
            addCriterion("nashuiren_shibiehao <>", value, "nashuirenShibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenShibiehaoGreaterThan(String value) {
            addCriterion("nashuiren_shibiehao >", value, "nashuirenShibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenShibiehaoGreaterThanOrEqualTo(String value) {
            addCriterion("nashuiren_shibiehao >=", value, "nashuirenShibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenShibiehaoLessThan(String value) {
            addCriterion("nashuiren_shibiehao <", value, "nashuirenShibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenShibiehaoLessThanOrEqualTo(String value) {
            addCriterion("nashuiren_shibiehao <=", value, "nashuirenShibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenShibiehaoLike(String value) {
            addCriterion("nashuiren_shibiehao like", value, "nashuirenShibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenShibiehaoNotLike(String value) {
            addCriterion("nashuiren_shibiehao not like", value, "nashuirenShibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenShibiehaoIn(List<String> values) {
            addCriterion("nashuiren_shibiehao in", values, "nashuirenShibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenShibiehaoNotIn(List<String> values) {
            addCriterion("nashuiren_shibiehao not in", values, "nashuirenShibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenShibiehaoBetween(String value1, String value2) {
            addCriterion("nashuiren_shibiehao between", value1, value2, "nashuirenShibiehao");
            return (Criteria) this;
        }

        public Criteria andNashuirenShibiehaoNotBetween(String value1, String value2) {
            addCriterion("nashuiren_shibiehao not between", value1, value2, "nashuirenShibiehao");
            return (Criteria) this;
        }

        public Criteria andJingyingQixianIsNull() {
            addCriterion("jingying_qixian is null");
            return (Criteria) this;
        }

        public Criteria andJingyingQixianIsNotNull() {
            addCriterion("jingying_qixian is not null");
            return (Criteria) this;
        }

        public Criteria andJingyingQixianEqualTo(String value) {
            addCriterion("jingying_qixian =", value, "jingyingQixian");
            return (Criteria) this;
        }

        public Criteria andJingyingQixianNotEqualTo(String value) {
            addCriterion("jingying_qixian <>", value, "jingyingQixian");
            return (Criteria) this;
        }

        public Criteria andJingyingQixianGreaterThan(String value) {
            addCriterion("jingying_qixian >", value, "jingyingQixian");
            return (Criteria) this;
        }

        public Criteria andJingyingQixianGreaterThanOrEqualTo(String value) {
            addCriterion("jingying_qixian >=", value, "jingyingQixian");
            return (Criteria) this;
        }

        public Criteria andJingyingQixianLessThan(String value) {
            addCriterion("jingying_qixian <", value, "jingyingQixian");
            return (Criteria) this;
        }

        public Criteria andJingyingQixianLessThanOrEqualTo(String value) {
            addCriterion("jingying_qixian <=", value, "jingyingQixian");
            return (Criteria) this;
        }

        public Criteria andJingyingQixianLike(String value) {
            addCriterion("jingying_qixian like", value, "jingyingQixian");
            return (Criteria) this;
        }

        public Criteria andJingyingQixianNotLike(String value) {
            addCriterion("jingying_qixian not like", value, "jingyingQixian");
            return (Criteria) this;
        }

        public Criteria andJingyingQixianIn(List<String> values) {
            addCriterion("jingying_qixian in", values, "jingyingQixian");
            return (Criteria) this;
        }

        public Criteria andJingyingQixianNotIn(List<String> values) {
            addCriterion("jingying_qixian not in", values, "jingyingQixian");
            return (Criteria) this;
        }

        public Criteria andJingyingQixianBetween(String value1, String value2) {
            addCriterion("jingying_qixian between", value1, value2, "jingyingQixian");
            return (Criteria) this;
        }

        public Criteria andJingyingQixianNotBetween(String value1, String value2) {
            addCriterion("jingying_qixian not between", value1, value2, "jingyingQixian");
            return (Criteria) this;
        }

        public Criteria andHezhunRiqiIsNull() {
            addCriterion("hezhun_riqi is null");
            return (Criteria) this;
        }

        public Criteria andHezhunRiqiIsNotNull() {
            addCriterion("hezhun_riqi is not null");
            return (Criteria) this;
        }

        public Criteria andHezhunRiqiEqualTo(String value) {
            addCriterion("hezhun_riqi =", value, "hezhunRiqi");
            return (Criteria) this;
        }

        public Criteria andHezhunRiqiNotEqualTo(String value) {
            addCriterion("hezhun_riqi <>", value, "hezhunRiqi");
            return (Criteria) this;
        }

        public Criteria andHezhunRiqiGreaterThan(String value) {
            addCriterion("hezhun_riqi >", value, "hezhunRiqi");
            return (Criteria) this;
        }

        public Criteria andHezhunRiqiGreaterThanOrEqualTo(String value) {
            addCriterion("hezhun_riqi >=", value, "hezhunRiqi");
            return (Criteria) this;
        }

        public Criteria andHezhunRiqiLessThan(String value) {
            addCriterion("hezhun_riqi <", value, "hezhunRiqi");
            return (Criteria) this;
        }

        public Criteria andHezhunRiqiLessThanOrEqualTo(String value) {
            addCriterion("hezhun_riqi <=", value, "hezhunRiqi");
            return (Criteria) this;
        }

        public Criteria andHezhunRiqiLike(String value) {
            addCriterion("hezhun_riqi like", value, "hezhunRiqi");
            return (Criteria) this;
        }

        public Criteria andHezhunRiqiNotLike(String value) {
            addCriterion("hezhun_riqi not like", value, "hezhunRiqi");
            return (Criteria) this;
        }

        public Criteria andHezhunRiqiIn(List<String> values) {
            addCriterion("hezhun_riqi in", values, "hezhunRiqi");
            return (Criteria) this;
        }

        public Criteria andHezhunRiqiNotIn(List<String> values) {
            addCriterion("hezhun_riqi not in", values, "hezhunRiqi");
            return (Criteria) this;
        }

        public Criteria andHezhunRiqiBetween(String value1, String value2) {
            addCriterion("hezhun_riqi between", value1, value2, "hezhunRiqi");
            return (Criteria) this;
        }

        public Criteria andHezhunRiqiNotBetween(String value1, String value2) {
            addCriterion("hezhun_riqi not between", value1, value2, "hezhunRiqi");
            return (Criteria) this;
        }

        public Criteria andDengjiJiguanIsNull() {
            addCriterion("dengji_jiguan is null");
            return (Criteria) this;
        }

        public Criteria andDengjiJiguanIsNotNull() {
            addCriterion("dengji_jiguan is not null");
            return (Criteria) this;
        }

        public Criteria andDengjiJiguanEqualTo(String value) {
            addCriterion("dengji_jiguan =", value, "dengjiJiguan");
            return (Criteria) this;
        }

        public Criteria andDengjiJiguanNotEqualTo(String value) {
            addCriterion("dengji_jiguan <>", value, "dengjiJiguan");
            return (Criteria) this;
        }

        public Criteria andDengjiJiguanGreaterThan(String value) {
            addCriterion("dengji_jiguan >", value, "dengjiJiguan");
            return (Criteria) this;
        }

        public Criteria andDengjiJiguanGreaterThanOrEqualTo(String value) {
            addCriterion("dengji_jiguan >=", value, "dengjiJiguan");
            return (Criteria) this;
        }

        public Criteria andDengjiJiguanLessThan(String value) {
            addCriterion("dengji_jiguan <", value, "dengjiJiguan");
            return (Criteria) this;
        }

        public Criteria andDengjiJiguanLessThanOrEqualTo(String value) {
            addCriterion("dengji_jiguan <=", value, "dengjiJiguan");
            return (Criteria) this;
        }

        public Criteria andDengjiJiguanLike(String value) {
            addCriterion("dengji_jiguan like", value, "dengjiJiguan");
            return (Criteria) this;
        }

        public Criteria andDengjiJiguanNotLike(String value) {
            addCriterion("dengji_jiguan not like", value, "dengjiJiguan");
            return (Criteria) this;
        }

        public Criteria andDengjiJiguanIn(List<String> values) {
            addCriterion("dengji_jiguan in", values, "dengjiJiguan");
            return (Criteria) this;
        }

        public Criteria andDengjiJiguanNotIn(List<String> values) {
            addCriterion("dengji_jiguan not in", values, "dengjiJiguan");
            return (Criteria) this;
        }

        public Criteria andDengjiJiguanBetween(String value1, String value2) {
            addCriterion("dengji_jiguan between", value1, value2, "dengjiJiguan");
            return (Criteria) this;
        }

        public Criteria andDengjiJiguanNotBetween(String value1, String value2) {
            addCriterion("dengji_jiguan not between", value1, value2, "dengjiJiguan");
            return (Criteria) this;
        }

        public Criteria andZhuceDizhiIsNull() {
            addCriterion("zhuce_dizhi is null");
            return (Criteria) this;
        }

        public Criteria andZhuceDizhiIsNotNull() {
            addCriterion("zhuce_dizhi is not null");
            return (Criteria) this;
        }

        public Criteria andZhuceDizhiEqualTo(String value) {
            addCriterion("zhuce_dizhi =", value, "zhuceDizhi");
            return (Criteria) this;
        }

        public Criteria andZhuceDizhiNotEqualTo(String value) {
            addCriterion("zhuce_dizhi <>", value, "zhuceDizhi");
            return (Criteria) this;
        }

        public Criteria andZhuceDizhiGreaterThan(String value) {
            addCriterion("zhuce_dizhi >", value, "zhuceDizhi");
            return (Criteria) this;
        }

        public Criteria andZhuceDizhiGreaterThanOrEqualTo(String value) {
            addCriterion("zhuce_dizhi >=", value, "zhuceDizhi");
            return (Criteria) this;
        }

        public Criteria andZhuceDizhiLessThan(String value) {
            addCriterion("zhuce_dizhi <", value, "zhuceDizhi");
            return (Criteria) this;
        }

        public Criteria andZhuceDizhiLessThanOrEqualTo(String value) {
            addCriterion("zhuce_dizhi <=", value, "zhuceDizhi");
            return (Criteria) this;
        }

        public Criteria andZhuceDizhiLike(String value) {
            addCriterion("zhuce_dizhi like", value, "zhuceDizhi");
            return (Criteria) this;
        }

        public Criteria andZhuceDizhiNotLike(String value) {
            addCriterion("zhuce_dizhi not like", value, "zhuceDizhi");
            return (Criteria) this;
        }

        public Criteria andZhuceDizhiIn(List<String> values) {
            addCriterion("zhuce_dizhi in", values, "zhuceDizhi");
            return (Criteria) this;
        }

        public Criteria andZhuceDizhiNotIn(List<String> values) {
            addCriterion("zhuce_dizhi not in", values, "zhuceDizhi");
            return (Criteria) this;
        }

        public Criteria andZhuceDizhiBetween(String value1, String value2) {
            addCriterion("zhuce_dizhi between", value1, value2, "zhuceDizhi");
            return (Criteria) this;
        }

        public Criteria andZhuceDizhiNotBetween(String value1, String value2) {
            addCriterion("zhuce_dizhi not between", value1, value2, "zhuceDizhi");
            return (Criteria) this;
        }

        public Criteria andJingyingFanweiIsNull() {
            addCriterion("jingying_fanwei is null");
            return (Criteria) this;
        }

        public Criteria andJingyingFanweiIsNotNull() {
            addCriterion("jingying_fanwei is not null");
            return (Criteria) this;
        }

        public Criteria andJingyingFanweiEqualTo(String value) {
            addCriterion("jingying_fanwei =", value, "jingyingFanwei");
            return (Criteria) this;
        }

        public Criteria andJingyingFanweiNotEqualTo(String value) {
            addCriterion("jingying_fanwei <>", value, "jingyingFanwei");
            return (Criteria) this;
        }

        public Criteria andJingyingFanweiGreaterThan(String value) {
            addCriterion("jingying_fanwei >", value, "jingyingFanwei");
            return (Criteria) this;
        }

        public Criteria andJingyingFanweiGreaterThanOrEqualTo(String value) {
            addCriterion("jingying_fanwei >=", value, "jingyingFanwei");
            return (Criteria) this;
        }

        public Criteria andJingyingFanweiLessThan(String value) {
            addCriterion("jingying_fanwei <", value, "jingyingFanwei");
            return (Criteria) this;
        }

        public Criteria andJingyingFanweiLessThanOrEqualTo(String value) {
            addCriterion("jingying_fanwei <=", value, "jingyingFanwei");
            return (Criteria) this;
        }

        public Criteria andJingyingFanweiLike(String value) {
            addCriterion("jingying_fanwei like", value, "jingyingFanwei");
            return (Criteria) this;
        }

        public Criteria andJingyingFanweiNotLike(String value) {
            addCriterion("jingying_fanwei not like", value, "jingyingFanwei");
            return (Criteria) this;
        }

        public Criteria andJingyingFanweiIn(List<String> values) {
            addCriterion("jingying_fanwei in", values, "jingyingFanwei");
            return (Criteria) this;
        }

        public Criteria andJingyingFanweiNotIn(List<String> values) {
            addCriterion("jingying_fanwei not in", values, "jingyingFanwei");
            return (Criteria) this;
        }

        public Criteria andJingyingFanweiBetween(String value1, String value2) {
            addCriterion("jingying_fanwei between", value1, value2, "jingyingFanwei");
            return (Criteria) this;
        }

        public Criteria andJingyingFanweiNotBetween(String value1, String value2) {
            addCriterion("jingying_fanwei not between", value1, value2, "jingyingFanwei");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createtime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createtime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}