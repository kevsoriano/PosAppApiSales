package com.jkngil.PosAppApiSales.services;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkngil.PosAppApiSales.data.SaleEntity;
import com.jkngil.PosAppApiSales.data.SaleRepository;
import com.jkngil.PosAppApiSales.shared.SaleDto;
import com.jkngil.PosAppApiSales.shared.SaleItemDto;

@Service
public class SaleServiceImpl implements SaleService {

	@Autowired
	SaleRepository saleRepository;
	
	@Override
	public SaleDto checkout(SaleDto saleDetails) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		for(int i=0;i<saleDetails.getItems().size();i++) {
			SaleItemDto item = saleDetails.getItems().get(i);
			item.setSale(saleDetails);
			saleDetails.getItems().set(i, item);
		}
		SaleEntity saleEntity = modelMapper.map(saleDetails, SaleEntity.class);
		SaleEntity createdSale = saleRepository.save(saleEntity);
		
		SaleDto returnValue = modelMapper.map(createdSale, SaleDto.class);
		return returnValue;
	}

}
