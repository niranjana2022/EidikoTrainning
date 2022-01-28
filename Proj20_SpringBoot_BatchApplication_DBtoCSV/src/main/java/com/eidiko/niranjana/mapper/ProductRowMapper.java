package com.eidiko.niranjana.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.eidiko.niranjana.model.Product;

public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		return new Product(rs.getInt(1),rs.getString(2), rs.getDouble(3),rs.getDouble(4),rs.getDouble(5));

}
}