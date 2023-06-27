package com.example.itemdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.itemdemo.repository.ItemRepository;
//import com.example.itemdemo.repository.itemRepository;
import com.example.itemsdemo.model.Items;
@Service  
public class ItemsService {
	
	
		@Autowired  
		private ItemRepository itemRepository;  
		//getting all books record by using the method findaAll() of CrudRepository  
		public List<Items> getAllBooks()   
		{  
		List<Items> books = new ArrayList<Items>();  
		itemRepository.findAll().forEach(books1 -> books.add(books1));  
		return books;  
		}  
		//getting a specific record by using the method findById() of CrudRepository  
		public Items getItemsById(int id)   
		{  
		return itemRepository.findById(id).get();  
		}  
		//saving a specific record by using the method save() of CrudRepository  
		public void saveOrUpdate(Items items)   
		{  
			itemRepository.save(items);  
		}  
		//deleting a specific record by using the method deleteById() of CrudRepository  
		public void delete(int id)   
		{  
			itemRepository.deleteById(id);  
		}  
		//updating a record  
		public void update(Items items, int bookid)   
		{  
			itemRepository.save(items);  
		}  

}
