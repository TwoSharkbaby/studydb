package com.mono.studydb.dao;

import com.mono.studydb.model.SaleDTO;
import com.mono.studydb.model.SaleVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SaleDao {

    List<Map<String, Object>> selectSaleMap(SaleDTO saleDTO);

    List<SaleVO> selectSaleVO(SaleDTO saleDTO);
}
