package com.dnb.devconnector.dto;



import java.util.regex.Pattern;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.dnb.devconnector.exceptions.InvalidMailException;
import com.dnb.devconnector.utils.CustomIdGenerator;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User{
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
//	@GenericGenerator(name = "user_seq", strategy = "com.dnb.devconnector.utils.CustomIdGenerator", parameters = {
//			@Parameter(name = "INCREMENT_PARAM", value = "50"),
//			@Parameter(name = CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "User_"),
//			@Parameter(name = CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d")
//			})
	private String user_id;
	private String UserName;
	private String UserEmail;
	private String UserPassword;
	
//	public void setUserName(String UserName) {
//		this.UserName = UserName;
//	}
//	public void setUserEmail(String UserEmail) throws InvalidMailException {
//		
//			this.UserEmail = UserEmail;
//		
//	}
//	public void setUserPassword(String UserPassword) {
//		
//			this.UserPassword = UserPassword;
//	
//	}
	


	
}
