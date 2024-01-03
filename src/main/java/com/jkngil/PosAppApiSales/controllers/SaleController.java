package com.jkngil.PosAppApiSales.controllers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jkngil.PosAppApiSales.models.SaleModel;
import com.jkngil.PosAppApiSales.services.SaleService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sales")
public class SaleController {

	@Autowired
	SaleService saleService;
	
	@PostMapping
	public ResponseEntity<SaleModel> checkout(@Valid @RequestBody SaleModel saleDetails) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
}
