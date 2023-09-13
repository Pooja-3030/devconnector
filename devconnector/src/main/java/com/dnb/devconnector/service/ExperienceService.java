package com.dnb.devconnector.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dnb.devconnector.dto.Experience;
import com.dnb.devconnector.dto.Profile;
import com.dnb.devconnector.exceptions.ProfileIdNotFoundException;

@Service
public interface ExperienceService {
	public Experience createUserExperience(Experience experience);
	public Optional<Experience> getUserExperienceByExperienceId(String Exp_id);
	public boolean deleteUserExperienceByExperienceId(String Exp_id);
	public Iterable<Experience> getAllUserExperience();

}
