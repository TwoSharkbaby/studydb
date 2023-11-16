package com.mono.studydb.dao;

import com.mono.studydb.model.music.Album;
import com.mono.studydb.model.music.Artist;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MusicDao {

    List<Album> selectAlbumAsso(String mstId);

    Artist selectArtistColl(String mstId);
}
