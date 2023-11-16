package com.mono.studydb.dao;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@MybatisTest  // 컨테이너 빈 설정
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // 마이바티스 설정
class AreaSalesDaoTest {

    @Autowired
    private AreaSalesDao areaSalesDao;

    @Test
    void findAreaSaleTest(){
        log.info(areaSalesDao.findAreaSale("10"));
    }

    @Test
    void findAreaSaleTest2(){
        log.info(areaSalesDao.findAreaSale2("10"));
    }

    @Test
    void findAreaSaleMapTest(){
        log.info(areaSalesDao.findAreaSaleMap("10"));
        Map<String, Object> areaSaleMap = areaSalesDao.findAreaSaleMap("10");
        log.info("areaSaleMap = " + areaSaleMap);
        areaSaleMap.forEach((s, o) -> log.info(String.format("%s = %s", s, o)));
    }

    @Test
    void inputMultiParamMapTest(){
        Map<String, String> inputMultiParam = new HashMap<>();
        inputMultiParam.put("prodid","00002");
        inputMultiParam.put("prodnm", "냉");
        Map<String, Object> result = areaSalesDao.inputMultiParam(inputMultiParam);
        log.info("result = " + result);
        result.forEach((s, o) -> log.info(String.format("%s = %s", s, o)));
    }

    @Test
    void biMultiParamMapTest(){
        Map<String, String> inputMultiParam = new HashMap<>();
        inputMultiParam.put("prodid","1");
        inputMultiParam.put("prodnm", "note");
        List<Map<String, Object>> result = areaSalesDao.biMultiParam(inputMultiParam);
        log.info("result = " + result);
        result.forEach(log::info);
    }

}