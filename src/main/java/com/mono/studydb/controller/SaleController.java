package com.mono.studydb.controller;

import com.mono.studydb.dao.SaleDao;
import com.mono.studydb.model.SaleDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SaleController {

    private final SaleDao saleDao;

    @GetMapping("home")
    public String home(SaleDTO saleDTO, Model model){
        saleDTO.setSeq1(2);
        saleDTO.setSeq1(3);
        saleDTO.setSeq1(4);
        saleDTO.setSeq1(5);
        saleDTO.setSeq1(6);
        saleDTO.setSeq1(7);
        saleDTO.setSeq1(8);
        saleDTO.setSeq1(9);
        saleDTO.setSeq1(1);
        saleDTO.setDir("F");
        model.addAttribute("result", saleDao.selectSaleVO(saleDTO));
        return "home";
    }
}
