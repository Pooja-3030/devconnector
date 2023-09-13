package com.dnb.devconnector.dto;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.dnb.devconnector.utils.CustomIdGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Experience {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "exp_seq")
	@GenericGenerator(name = "exp_seq" ,strategy = "com.dnb.devconnector.utils.CustomIdGenerator",parameters = {
	@Parameter(name =CustomIdGenerator.INCREMENT_PARAM, value ="50" ),
	@Parameter(name= CustomIdGenerator.VALUE_PREFIX_DEFAULT,value ="EXP_"),
	@Parameter(name =CustomIdGenerator.DATE_FORMAT_PARAMETER,value="2023-01" ),
	@Parameter(name =CustomIdGenerator.NUMBER_FORMAT_PARAMETER,value="%05d")
	})
	private String Exp_id;
	@NotBlank
	private String JobTitle;
	@NotBlank
	private String Company;
	private String Location;
	

}
