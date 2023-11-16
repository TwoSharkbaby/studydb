package com.mono.studydb.dao;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@MybatisTest  // 컨테이너 빈 설정
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // 마이바티스 설정
class DummyDaoTest {

    @Autowired
    private DummyDao dummyDao;

    @Test
    public void dummyTest(){
        String result = dummyDao.selectCurTime();
        log.info(result);
    }

    @Test
    public void dummyTest2(){
        String result = dummyDao.selectCurTime2(10);
        log.info(result);
    }

}