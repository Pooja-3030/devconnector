package com.dnb.devconnector.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnb.devconnector.dto.Experience;
import com.dnb.devconnector.dto.Profile;
import com.dnb.devconnector.repo.ExperienceRepository;
@Service
public class ExperienceServiceImpl implements ExperienceService {
@Autowired
ExperienceRepository experienceRepository;
	@Override
	public Experience createUserExperience(Experience experience) {
		// TODO Auto-generated method stub
		return experienceRepository.save(experience);
	}

	@Override
	public Optional<Experience> getUserExperienceByExperienceId(String Exp_id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean deleteUserExperienceByExperienceId(String Exp_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Experience> getAllUserExperience() {
		// TODO Auto-generated method stub
		return null;
	}

}
