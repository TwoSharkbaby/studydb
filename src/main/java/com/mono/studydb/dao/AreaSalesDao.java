package com.mono.studydb.dao;

import com.mono.studydb.model.AreaVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface AreaSalesDao {

    AreaVO findAreaSale(String argCD);

    AreaVO findAreaSale2(String argCD);

    Map<String, Object> findAreaSaleMap(String argCD);

    Map<String, Object> inputMultiParam(Map<String, String> param);

    List<Map<String, Object>> biMultiParam(Map<String, String> param);

}
