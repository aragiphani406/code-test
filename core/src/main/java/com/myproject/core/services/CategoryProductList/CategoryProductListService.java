package com.myproject.core.services.CategoryProductList;

import java.util.List;

import com.myproject.core.beans.CategoryProductListBean;

public interface CategoryProductListService {

	public List<CategoryProductListBean> getCatProdList() throws Exception;
}
