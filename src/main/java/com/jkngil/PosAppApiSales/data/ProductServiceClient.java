package com.jkngil.PosAppApiSales.data;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="products-ws")
public interface ProductServiceClient {

}
