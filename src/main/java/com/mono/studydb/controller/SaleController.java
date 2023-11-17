package com.mono.studydb.controller;

import com.mono.studydb.dao.SaleDao;
import com.mono.studydb.model.SaleDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class SaleController {

    private final SaleDao saleDao;

    @GetMapping("/home")
    public String home(@ModelAttribute SaleDTO saleDTO, Model model){
        System.out.println("saleDTO = " + saleDTO);
        model.addAttribute("result", saleDao.selectSaleVO(saleDTO));
        return "home";
    }

    @GetMapping("/map")
    public String map(@ModelAttribute SaleDTO saleDTO, Model model){
        System.out.println("mapDTO = " + saleDTO);
        List<Map<String, Object>> result =  saleDao.selectSaleMap(saleDTO);
        result.forEach(System.out::println);
        model.addAttribute("result", result);
        return "map";
    }
}
