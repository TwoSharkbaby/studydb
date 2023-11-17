package com.mono.studydb.dao;

import com.mono.studydb.model.SaleDTO;
import com.mono.studydb.model.SaleVO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
@MybatisTest  // 컨테이너 빈 설정
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // 마이바티스 설정
class SaleDaoTest {

    @Autowired
    private SaleDao saleDao;

    @Test
    void saleMapTest() {
        Map<String, Object> param = new HashMap<>();
        SaleDTO saleDTO = SaleDTO.builder()
                .dir("F")
                .seq1(2)
                .seq2(3)
                .seq3(4)
                .seq4(5)
                .seq5(6)
                .seq6(7)
                .seq7(8)
                .seq8(9)
                .seq9(1)
                .build();

        List<Map<String, Object>> result = saleDao.selectSaleMap(saleDTO);
        log.info(result);
    }

    @Test
    void saleVOTest() {
        SaleDTO saleDTO = SaleDTO.builder()
                .dir("F")
                .seq1(2)
                .seq2(3)
                .seq3(4)
                .seq4(5)
                .seq5(6)
                .seq6(7)
                .seq7(8)
                .seq8(9)
                .seq9(1)
                .build();

        List<SaleVO> result = saleDao.selectSaleVO(saleDTO);
        log.info(result);
    }

}