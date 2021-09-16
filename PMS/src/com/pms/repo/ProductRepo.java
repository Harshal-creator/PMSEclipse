package com.pms.repo;
import com.pms.entity.Product;
public interface ProductRepo {

	void createProductList();
	Product getProduct(int id);
	Product[] getAllProduct();
	Product[] getSpecific();
}
