package com.myproject.core.models;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

import com.myproject.core.beans.CategoryProductListBean;
import com.myproject.core.services.CategoryProductList.CategoryProductListService;

@Model(adaptables=Resource.class)
public class GetCatTabsDataModel {
	
	@Inject
	private CategoryProductListService catProdListService;
	
	@SlingObject 
	private Resource res;
	
	private List<CategoryProductListBean> catProductList = null;
	
	@PostConstruct
	protected void init() {
	
		// get the categories and products associated list
		catProductList = catProdListService.getCatProdList();
	}
	
	public List<CategoryProductListBean> getCategoryProductList(){
		return catProductList;
	}

}
