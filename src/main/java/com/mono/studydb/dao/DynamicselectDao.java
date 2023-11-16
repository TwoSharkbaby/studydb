package com.mono.studydb.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DynamicselectDao {

    List<Map<String, Object>> selectAlbumAsso(List<String> classList);

    List<Map<String, Object>> dynamicIf(String name);

    List<Map<String, Object>> dynamicMultiIf(Map<String, Object> param);

    List<Map<String, Object>> dynamicMultiTrim(Map<String, Object> param);

}
