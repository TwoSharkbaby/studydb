package com.mono.studydb.model.music;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Song {

    private String albumId;
    private String songName;
    private float playTime;

    private Album album;
    private Artist artist;
}
