package com.mono.studydb.dao;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@MybatisTest  // 컨테이너 빈 설정
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // 마이바티스 설정
class DynamicselectDaoTest {

    @Autowired
    DynamicselectDao dynamicselectDao;

    @Test
    void dynamicTest(){
        List<String> stringList = new ArrayList<>();
        stringList.add("달림반");
        stringList.add("별림반");
        stringList.add("햇림반");
        log.info(dynamicselectDao.selectAlbumAsso(stringList));
    }

    @Test
    void dynamicIfTest(){
        log.info(dynamicselectDao.dynamicIf("김진우"));
    }

    @Test
    void dynamicMultiIfTest(){
        Map<String, Object> param = new HashMap<>();
        param.put("name", "김진우");
        param.put("class", "별림반");
        param.put("grade", "4");

        log.info(dynamicselectDao.dynamicMultiIf(param));
    }

    @Test
    void dynamicMultiTrimTest(){
        Map<String, Object> param = new HashMap<>();
//        param.put("name", "김진우");
        param.put("grade", "4");

        log.info(dynamicselectDao.dynamicMultiTrim(param));
    }
}