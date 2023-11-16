package com.mono.studydb.dao;

import com.mono.studydb.model.music.Album;
import com.mono.studydb.model.music.Artist;
import com.mono.studydb.model.music.Song;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AlbumDao {

    Album selectAlbumToSongCollection(String albumId);

    List<Song> selectSongToAlbumAssociation(String albumId);

    // AssociationMapping을 하는게 더 객체지향적임
    Artist selectArtistToSongCollection(String mst_id);

    List<Song> selectSongToArtistAssociation(String mst_id);

    List<Album> selectAll(String mst_id);

}
