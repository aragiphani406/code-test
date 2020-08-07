package com.myproject.core.services.CategoryProductList.Impl;

import java.util.List;

import com.myproject.core.beans.CategoryProductListBean;
import com.myproject.core.services.CategoryProductList.CategoryProductListService;

public class CategoryProductListServiceImpl implements CategoryProductListService{

	@Override
	public List<CategoryProductListBean> getCatProdList(){
		
		List<CategoryProductListBean> catProdList = null;
		
		//get the feed from an API because we are expecting to see such a huge data as per example data given.
		
		/* if the data formatting is as per the example 
		* get the data from API in JSON format
		* Iterate through the complete list and separate all the categories into single CATEGORY Object
		* process and add the products and its details into individual Category Object as per the received API data
		* convert it into a List and send it back to the Model
		*/
		
		return catProdList;
	}
	
}
