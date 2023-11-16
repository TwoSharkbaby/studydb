package com.mono.studydb.dao;

import com.mono.studydb.model.music.Album;
import com.mono.studydb.model.music.Artist;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@MybatisTest  // 컨테이너 빈 설정
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // 마이바티스 설정
class MusicDaoTest {

    @Autowired
    private MusicDao musicDao;

    @Test
    void associateTest(){
        List<Album> albumList = musicDao.selectAlbumAsso("BTS");
        albumList.forEach(log::info);
    }

    @Test
    void selectArtistCollTest(){
        Artist artist = musicDao.selectArtistColl("BTS");
        log.info(artist);
    }


}