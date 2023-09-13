package com.dnb.devconnector.utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class DBUtils {
	@Autowired
	DataSource dataSource;
	public DBUtils() {
		// TODO Auto-generated constructor stub
	}

	public Optional<Connection> getConnection() {
		
		
	
		try {
			Connection connection= dataSource.getConnection();
			return Optional.of(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Optional.empty();
		
	}
	public void closeConnection(Connection connection) {
		try {
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}
	


}
