package com.mono.studydb.model.music;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Album {

    private String albumId;
    private String mstId;
    private int albumSeq;
    private String albumTitle;
    private String openDate;

    private Artist artist;
    private List<Song> song;
}
