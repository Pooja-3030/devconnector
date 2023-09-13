package com.dnb.devconnector.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dnb.devconnector.dto.Experience;
import com.dnb.devconnector.dto.Profile;
@Repository
public interface ExperienceRepository extends CrudRepository<Experience, String>{

}
