package com.mono.studydb.model;

import lombok.*;

@Setter
@NoArgsConstructor
@ToString
@Getter
@AllArgsConstructor
@Builder
public class AreaVO {

    private String areaCD;
    private String regionArea;
    private String prodId;
    private Integer saleCnt;

}
