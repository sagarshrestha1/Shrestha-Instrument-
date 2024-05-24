package cn.sagar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.sagar.Product;
import cn.sagar.cart;

public class ProductDao {
	private Connection con;
	private String query;
	private PreparedStatement pst;
	private ResultSet rs;
	private String names;
	public ProductDao(Connection con) {
		this.con = con;
	}
public List<Product>getAllProducts(){
	List<Product>products= new ArrayList<Product>();
	try {
		query = "select * from ecommerce_product";
		pst = this.con.prepareStatement(query);
		rs = pst.executeQuery();
		while(rs.next()) {
			Product row = new Product();
			row.setId(rs.getInt("id"));
			row.setName(rs.getString("name"));
			row.setCategory(rs.getString("category"));
			row.setPrice(rs.getDouble("price"));
			row.setImage(rs.getString("image"));
			products.add(row);
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	return products;
}
public List<Product>getWesternProduct(){
	List<Product>products= new ArrayList<Product>();
	try {
		query = "select * from ecommerce_westerncategory ";
		
		pst = this.con.prepareStatement(query);
	
		rs = pst.executeQuery();
		while(rs.next()) {
			Product row = new Product();
			row.setId(rs.getInt("id"));
			row.setName(rs.getString("name"));
			row.setCategory(rs.getString("category"));
			row.setPrice(rs.getDouble("price"));
			row.setImage(rs.getString("image"));
			products.add(row);
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	return products;
}
public List<cart>getCartProducts(ArrayList<cart> cartList)
{
	List<cart>products= new ArrayList<cart>();
	try {
		if(cartList.size()>0) {
			for(cart item:cartList) {
				query ="select * from ecommerce_product where id=?";
				pst= this.con.prepareStatement(query);
				pst.setInt(1, item.getId());
				rs = pst.executeQuery();
				while(rs.next()) {
					cart row = new cart();
					row.setId(rs.getInt("id"));
					row.setName(rs.getString("name"));
					row.setCategory(rs.getString("category"));
					row.setPrice(rs.getDouble("price")*item.getQuantity());
					row.setQuantity(item.getQuantity());
					products.add(row);
				}
				
				
			}
		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	return products;
}
public double getTotalCartPrice(ArrayList<cart> cartList) {
	double sum = 0;
	try {
		if(cartList.size()>0) {
			for(cart item:cartList) {
				query="select price from ecommerce_product where id=?";
				pst=this.con.prepareStatement(query);
				pst.setInt(1, item.getId());
				rs=pst.executeQuery();
				while(rs.next()) {
					sum+=rs.getDouble("price")*item.getQuantity();
				}
			}
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return sum;
}
public List<Product> searchedItem(String name){
	
	List<Product> list = new ArrayList<Product>();
	try{
		query = "select * from ecommerce_product where name=?";
		pst = this.con.prepareStatement(query);
		pst.setString(1,name);
		rs = pst.executeQuery();
		while(rs.next()) {
			Product search = new Product();
			search.setId(rs.getInt("id"));
			search.setName(rs.getString("name"));
			search.setCategory(rs.getString("category"));
			search.setPrice(rs.getDouble("price"));
			search.setImage(rs.getString("image"));
			list.add(search);
		}
		return list;
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return list;
	
}

}
