package com.jkngil.PosAppApiSales.services;

import com.jkngil.PosAppApiSales.shared.SaleDto;

public interface SaleService {
	SaleDto checkout(SaleDto saleDetails);
}
