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
//        param.put("areaCd", null);
//        param.put("areaCd", "");
//        param.put("areaCd", 10);

//        param.put("row",null);
//        param.put("row","");
//        param.put("row","100");

//        param.put("gr",null);
//        param.put("gr","");
//        param.put("gr","00");
//        param.put("gr","01");
//        param.put("gr","11");

        param.put("dir", "F");
//        param.put("dir","");

        param.put("seq1", "6");
        param.put("seq2", "7");
        param.put("seq3", "8");
        param.put("seq4", "9");
        param.put("seq5", "1");
        param.put("seq6", "2");
        param.put("seq7", "3");
        param.put("seq8", "4");
        param.put("seq9", "5");

        List<Map<String, Object>> result = saleDao.selectSaleMap(param);
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