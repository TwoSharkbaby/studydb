package com.mono.studydb.dao;

import com.mono.studydb.model.AreaVO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
@MybatisTest  // 컨테이너 빈 설정
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // 마이바티스 설정
class dmlDaoTest {

    @Autowired
    private DmlDao dmlDao;

    @Rollback(value = false)
    @Test
    void insertOneTest() {
        Map<String, Object> param = new HashMap<>();
//        param.put("name", "김지우");
//        param.put("class", "영제반");
//        param.put("kor", 100);
//        param.put("eng", 100);
//        param.put("mat", 100);
//        param.put("grade", 6);

        log.info(dmlDao.insertOne(param));
    }

    @Rollback(value = false)
    @Test
    void insertOneVOTest() {
        AreaVO vo = AreaVO.builder()
                .areaCD("김밥")
                .regionArea("천국")
                .prodId("노김밥")
                .saleCnt(119).build();

        log.info(dmlDao.insertOneVO(vo));
    }

    @Rollback(value = false)
    @Test
    void updateQueryTest() {
        Map<String, Object> param = new HashMap<>();
        param.put("areaCD", "김밥2");
        param.put("regionArea", "나라김밥");
        param.put("prodId", "노김밥");
        param.put("saleCnt", 30);

        log.info(dmlDao.updateQuery(param));
    }

    @Rollback(value = false)
    @Test
    void deleteTest() {
        log.info(dmlDao.delete("김밥1"));
    }




}