package com.pms.repo;


import com.pms.entity.Product;


public class ProductInfoRepoImpl implements ProductRepo{

	Product listofProduct[];
	
	@Override
	public void createProductList() {
		listofProduct=new Product[5];
		listofProduct[0]= new Product("Guitar",11, "Givson", 25000.00F);
		listofProduct[1]= new Product("Drums",12, "ZildiZian", 55000.00F);
		listofProduct[2]= new Product("Piano",13, "Kawai", 28000.00F);
		listofProduct[3]= new Product("Bass",14, "Fender", 41000.00F);
		listofProduct[4]= new Product("ukulel",15, "Martin", 35000.00F);
		
	}

	@Override
	public Product getProduct(int id) {
		Product e1=null;
		for(int i=0;i<listofProduct.length;i++) {
			Product e=listofProduct[i];
			if(e.getPid()==id) {
				e1=e;
			}
		}
		return e1;
	}

	@Override
	public Product[] getAllProduct() {
		return listofProduct;
	}

	@Override
	public Product[] getSpecific() {
		
		int i=0;
		Product[] p=new Product[2];
		for(Product p1: listofProduct) {
			if(p1.getPrice()>28000.00F) {
				p[i]=p1;
				i++;
			}
		}
		
		return p;
		
		 
	}
	
}
