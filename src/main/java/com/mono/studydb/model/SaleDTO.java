package com.mono.studydb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaleDTO {

    private String areaCd ="";
    private String row ="";
    private String gr ="";
    private String dir ="";
    private int seq1 = 1;
    private int seq2 = 2;
    private int seq3 = 3;
    private int seq4 = 4;
    private int seq5 = 5;
    private int seq6 = 6;
    private int seq7 = 7;
    private int seq8 = 8;
    private int seq9 = 9;


}
