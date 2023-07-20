package com.healthcare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.healtcare.entites.Product;
import com.healthcare.helper.ConnectionProvider;

public class ProductDaoImpl implements ProductDao {
	Product p = new Product();
	
	@Override
	public void addProduct(Product product) {
		
		try {
			Connection con = ConnectionProvider.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, product.getPid());
			ps.setString(2, product.getPname());
			ps.setString(3, product.getPbrand());
			ps.setString(4, product.getPtype());
			ps.setString(5, product.getPimageName());
			ps.setString(6, product.getPdescription());
			ps.setDouble(7, product.getPquantityAvaiable());
			ps.setDouble(8, product.getPunitPrice());
			ps.setBoolean(9, product.isPisAvailable());
			
			
			int executeUpdate = ps.executeUpdate();
			System.out.println(executeUpdate + " row added succefully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}




	@Override
	public Product getProduct(int id) {
		try {
			Connection con = ConnectionProvider.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from product where Pid =?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			rs.next();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPbrand(rs.getString(3));
			p.setPtype(rs.getString(4));
			p.setPimageName(rs.getString(5));
			p.setPdescription(rs.getString(6));
			p.setPquantityAvaiable(rs.getDouble(7));
			p.setPunitPrice(rs.getDouble(8));
			p.setPisAvailable(rs.getBoolean(9));

			return p;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public void updateProduct(Product product) {
		try {
			Connection con = ConnectionProvider.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"update product set "
					+ "Pname=?,"
					+ "Pbrand=?,"
					+ "Ptype=?,"
					+ "PimageName=?,"
					+ "Pdescription=?,"
					+ "PquantityAvaiable=?,"
					+ "PunitPrice=?,"
					+ "PisAvailable=? "
					+ "where Pid =?");
			ps.setString(1, product.getPname());
			ps.setString(2, product.getPbrand());
			ps.setString(3, product.getPtype());
			ps.setString(4, product.getPimageName());
			ps.setString(5, product.getPdescription());
			ps.setDouble(6, product.getPquantityAvaiable());
			ps.setDouble(7, product.getPunitPrice());
			ps.setBoolean(8, product.isPisAvailable());
			ps.setInt(9, product.getPid());
			
			int executeUpdate = ps.executeUpdate();
			System.out.println(executeUpdate + " row updated succefully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void makeProducAvailable(int id, boolean state) {
		try {
			Connection con = ConnectionProvider.getConnection();
			PreparedStatement ps = con.prepareStatement("update product set PisAvailable=? where Pid=?");
			if(state) {
				ps.setBoolean(1, true);
			}else {
				ps.setBoolean(1, false);
			}
			ps.setInt(2, id);
			
			int executeUpdate = ps.executeUpdate();
			System.out.println(executeUpdate + " product state updated succefully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<Product> viewProdcut() {
		
		try {
			ArrayList<Product> listProd = new ArrayList<>();
			Connection con = ConnectionProvider.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from product where PisAvailable=true");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPbrand(rs.getString(3));
				p.setPtype(rs.getString(4));
				p.setPimageName(rs.getString(5));
				p.setPdescription(rs.getString(6));
				p.setPquantityAvaiable(rs.getDouble(7));
				p.setPunitPrice(rs.getDouble(8));
				p.setPisAvailable(rs.getBoolean(9));
				
				listProd.add(p);
				
			}
			
			return listProd;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}




	@Override
	public Product searchProduct(String search) {
		try {

			Connection con = ConnectionProvider.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from product where Pname=? or Pbrand=? or Ptype=? or Pdescription=?");
			ps.setString(1, search);
			ps.setString(2, search);
			ps.setString(3, search);
			ps.setString(4, search);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPbrand(rs.getString(3));
				p.setPtype(rs.getString(4));
				p.setPimageName(rs.getString(5));
				p.setPdescription(rs.getString(6));
				p.setPquantityAvaiable(rs.getDouble(7));
				p.setPunitPrice(rs.getDouble(8));
				p.setPisAvailable(rs.getBoolean(9));
				
				
			}
			
			return p;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	





}
