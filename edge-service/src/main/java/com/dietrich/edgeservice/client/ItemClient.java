package com.dietrich.edgeservice.client;

import com.dietrich.edgeservice.dto.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient("item-catalog-service")
public interface ItemClient {
    @GetMapping("/items")
    Collection<Item> readItems();
}
