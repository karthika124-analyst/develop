package com.example.itemsdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.itemdemo.service.ItemsService;
import com.example.itemsdemo.model.Items;

@CrossOrigin(origins = "http://localhost:8080")
@RestController  
public class itemsController {
	
	@Autowired
	private ItemsService itemsService;

	@GetMapping("/item")
	private List<Items> getAllBooks() 
	{
	return itemsService.getAllBooks();
	}
	
	@GetMapping("/items/{itemid}")
	private Items getBooks(@PathVariable("itemid") int bookid) 
	{
	return itemsService.getItemsById(bookid);
	}
	
	@DeleteMapping("/items/{itemid}")
	private void deleteBook(@PathVariable("itemid") int bookid) 
	{
		itemsService.delete(bookid);
	}
	
	@PostMapping("/items")
	private int saveBook(@RequestBody Items items) 
	{
		itemsService.saveOrUpdate(items);
	return items.getItemId();
	}
	
	@PutMapping("/items")
	private Items update(@RequestBody Items items) 
	{
		itemsService.saveOrUpdate(items);
	return items;
	}


}
