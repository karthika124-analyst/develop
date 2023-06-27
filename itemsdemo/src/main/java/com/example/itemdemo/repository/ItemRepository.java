package com.example.itemdemo.repository;
import com.example.itemsdemo.model.Items;
import org.springframework.data.repository.CrudRepository; 

public interface  ItemRepository extends CrudRepository<Items, Integer> {

}
