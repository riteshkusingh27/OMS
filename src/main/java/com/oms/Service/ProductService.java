package com.oms.Service;

import com.oms.Repo.ProductRepo;
import com.oms.dto.ProductRequest;
import com.oms.entity.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
   private final  ProductRepo productRepo;



    public void createProduct(ProductRequest productRequest){
   Product product =      Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productRepo.save(product);
        log.info("Product {} is saved" , product.getId());
    }
      // save it to the database


}
