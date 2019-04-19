package com.roshan.onlineShoppingBackend.DAO;

import java.util.List;

import com.roshan.onlineShoppingBackend.DTO.Category;

public interface CategoryDAO {
	
	List<Category> list();  // Function to list all the Categories.
	
	Category get(int id);   // Function to get category details by its id.
	
}
