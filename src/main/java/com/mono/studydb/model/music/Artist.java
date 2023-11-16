package com.mono.studydb.model.music;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Artist {

    private String mstId;
    private String mstName;
    private String debutDate;

    private List<Album> album;
    private List<Song> song;

}
