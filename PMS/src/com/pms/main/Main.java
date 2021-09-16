package com.pms.main;

import com.pms.entity.*;

import com.pms.repo.*;
public class Main {

	public static void main(String[] args) {
		ProductRepo pdr=new ProductInfoRepoImpl();
		pdr.createProductList();
		
		Product e=pdr.getProduct(11);
		
		System.out.println("Product id is "+e.getPid());
		System.out.println("Product Name is "+e.getName());
		
		System.out.println("Product brand is "+e.getPcompany());
		System.out.println("Product price is "+e.getPrice());
		
		Product parr[]=pdr.getAllProduct();
		
		System.out.println("\nPid  P name  P Company  P Price");
		
		for (Product prod:parr) {
			System.out.println(prod.getPid()+"\t"+prod.getName()+"\t"+prod.getPcompany()+"\t"+prod.getPrice());
		}
		Product[] p1=pdr.getSpecific();
		for(Product pdct:p1) {
			System.out.println(pdct.getPid()+"\t"+pdct.getName()+"\t"+pdct.getPcompany()+"\t"+pdct.getPrice());
		}
		
	}
}
