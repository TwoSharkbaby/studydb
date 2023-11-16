package com.mono.studydb.dao;

import com.mono.studydb.model.AreaVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DmlDao {
    int insertOne(Map<String, Object> param);

    int insertOneVO(AreaVO vo);

    int multiInsert(List<AreaVO> paramList);

    int updateQuery(Map<String , Object> param);

    int delete(String param);

}
