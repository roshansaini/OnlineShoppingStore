package com.roshan.onlineShoppingBackend.DAOImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.roshan.onlineShoppingBackend.DAO.CategoryDAO;
import com.roshan.onlineShoppingBackend.DTO.Category;

@Repository("CategoryDAO")
public class CategoryDAOImplementation implements CategoryDAO {

	private static List<Category> categories=new ArrayList<>();  // declaring a category list
	
	static  // initializing a category 
	{
		Category category=new Category();
		
		// adding 1 category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This TV description..!!");
		category.setImageURL("CAT_1.png");
		category.setActive(true);
		
		categories.add(category); // adding the object to the list.
		
		category=new Category();
		
		// adding 2 category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This Mobile description..!!");
		category.setImageURL("CAT_2.png");
		category.setActive(true);
		
		categories.add(category); // adding the object to the list.
		
		category=new Category();
		
		// adding 1 category
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This Laptop description..!!");
		category.setImageURL("CAT_3.png");
		category.setActive(true);
		
		categories.add(category); // adding the object to the list.
	}
	
	@Override
	public List<Category> list() {
		// This method will return list all categories above created
		return categories;
	}

	@Override
	public Category get(int id) {

		// Enchanced For  Loop
		for(Category category:categories)
		{
			if(category.getId()==id)
			{
				return category;
			}
		}
		return null;
	}

}
