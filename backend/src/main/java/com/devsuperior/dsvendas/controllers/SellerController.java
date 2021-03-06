package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.DTO.SaleSumDTO;
import com.devsuperior.dsvendas.DTO.SellerDTO;
import com.devsuperior.dsvendas.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    @Autowired
    private SellerService service;

    @GetMapping
    private ResponseEntity<List<SellerDTO>> findAll(){
        List<SellerDTO> seller = service.findAll();
        return ResponseEntity.ok().body(seller);
    }
}
