package com.mono.studydb.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DummyDao {
    String selectCurTime();

    String selectCurTime2(Integer opt);
}
