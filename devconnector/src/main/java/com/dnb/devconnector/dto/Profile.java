package com.dnb.devconnector.dto;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.dnb.devconnector.utils.CustomIdGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_seq")
	@GenericGenerator(name = "account_seq", strategy = "com.dnb.devconnector.utils.CustomIdGenerator", parameters = {
			@Parameter(name = "INCREMENT_PARAM", value = "50"),
			@Parameter(name = CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "Prof_"),
			@Parameter(name = CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d")
			})
	private String profileID;
	public void setProfileID(String profileID) {
		this.profileID = profileID;
	}
	public void setProfessionalStatus(String professionalStatus) {
		ProfessionalStatus = professionalStatus;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public void setSkills(String skills) {
		Skills = skills;
	}
	public void setGitHubLink(String gitHubLink) {
		GitHubLink = gitHubLink;
	}
	public void setPersonalInfo(String personalInfo) {
		PersonalInfo = personalInfo;
	}
	public void setTwitterURL(String twitterURL) {
		this.twitterURL = twitterURL;
	}
	public void setFacebookURL(String facebookURL) {
		this.facebookURL = facebookURL;
	}
	public void setYoutubeURL(String youtubeURL) {
		this.youtubeURL = youtubeURL;
	}
	public void setLinkedlinURL(String linkedlinURL) {
		this.linkedlinURL = linkedlinURL;
	}
	public void setInstagramURL(String instagramURL) {
		this.instagramURL = instagramURL;
	}
	private String ProfessionalStatus;
	private String companyName;
	private String websiteName;
	private String Location;
	private String Skills;
	private String GitHubLink;
	private String PersonalInfo;
	private String twitterURL;
    private String facebookURL;
    private String youtubeURL;
    private String linkedlinURL;
    private String instagramURL;
    public void createUserProfile(String profileID, String ProfessionalStatus, String companyName, String websiteName, String Location,
			String Skills, String GitHubLink, String PersonalInfo, String twitterURL, String facebookURL, String youtubeURL,
			String linkedlinURL, String instagramURL) {
    	
    	this.ProfessionalStatus=ProfessionalStatus;
    	this.companyName=companyName;
    	this.websiteName=websiteName;
    	this.Location=Location;
    	this.Skills=Skills;
    	this.GitHubLink=GitHubLink;
    	this.PersonalInfo=PersonalInfo;
    	this.twitterURL=twitterURL;
    	this.facebookURL=facebookURL;
    	this.youtubeURL=youtubeURL;
    	this.linkedlinURL=linkedlinURL;
    	this.instagramURL=instagramURL;
    	
    }
	

}
