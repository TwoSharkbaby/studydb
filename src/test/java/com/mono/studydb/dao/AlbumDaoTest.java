package com.mono.studydb.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mono.studydb.model.music.Album;
import com.mono.studydb.model.music.Artist;
import com.mono.studydb.model.music.Song;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@MybatisTest  // 컨테이너 빈 설정
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // 마이바티스 설정
class AlbumDaoTest {

    @Autowired
    private AlbumDao albumDao;

    ObjectMapper objectMapper;

    @BeforeEach
    void setup(){
        objectMapper = new ObjectMapper();
        log.info("===============================");
    }

    @AfterEach
    void after(){
        objectMapper = new ObjectMapper();
        log.info("===============================");
    }

    @Test
    void collectionTest() throws JsonProcessingException {
        Album album = albumDao.selectAlbumToSongCollection("BP1");
        //log.info(album);
        log.info(objectMapper.writeValueAsString(album));

    }

    @Test
    void associateTest() throws JsonProcessingException {
        List<Song> songList = albumDao.selectSongToAlbumAssociation("BP1");
        //log.info(album);
        log.info(objectMapper.writeValueAsString(songList));
        songList.forEach(song -> log.info(song.getAlbum()));

    }

    @Test
    void selectArtistToSongCollectionTest() throws JsonProcessingException {
        Artist artist = albumDao.selectArtistToSongCollection("BTS");
        log.info(objectMapper.writeValueAsString(artist));
        artist.getSong().forEach(log::info);

    }

    @Test
    void selectSongToArtistAssociationTest() throws JsonProcessingException {
        List<Song> songList = albumDao.selectSongToArtistAssociation("BTS");
        log.info(objectMapper.writeValueAsString(songList));
        songList.forEach(log::info);

    }

    @Test
    void selectAllTest() throws JsonProcessingException {
        List<Album> album = albumDao.selectAll("BTS");
        log.info(objectMapper.writeValueAsString(album));

    }

}