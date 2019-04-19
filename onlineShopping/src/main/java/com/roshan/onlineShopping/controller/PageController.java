package com.roshan.onlineShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.roshan.onlineShoppingBackend.DAO.CategoryDAO;
import com.roshan.onlineShoppingBackend.DTO.Category;

@Controller
public class PageController {

	
	@Autowired  // accessing the CategoryDAOImplementaion Class from Backend using @Autowiring and @Repository
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("categories",categoryDAO.list()); // sending category list to the main page
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}	
	
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	/*
	 * Showing all products and based on category
	 * */
	
	@RequestMapping(value= "/show/all/products")
	public ModelAndView AllProducts()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","All Products");
		mv.addObject("categories",categoryDAO.list()); // sending category list to the main page
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	
	@RequestMapping(value= "/show/category/{id}/products")
	public ModelAndView CategoryProducts(@PathVariable("id") int id)
	{
		ModelAndView mv=new ModelAndView("page");
		
		/* Fetching category name using its Id from CategoryDAO from Backend */		
		Category category=null;
		
		category=categoryDAO.get(id);
		
		mv.addObject("title",category.getName());  // sending category name
		mv.addObject("categories",categoryDAO.list()); // sending category list to the main page
		mv.addObject("category",category); // sending single category to the main page
		mv.addObject("userClickCategoryProducts",true);
		return mv;
	}
}
