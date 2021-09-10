package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.DTO.SaleDTO;
import com.devsuperior.dsvendas.DTO.SellerDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.service.SaleService;
import com.devsuperior.dsvendas.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    private ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        Page<SaleDTO> seller = service.findAll(pageable);
        return ResponseEntity.ok().body(seller);
    }
}
