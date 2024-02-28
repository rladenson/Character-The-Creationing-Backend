package com.ctc.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctc.restservice.models.Character;

public interface MentalSkillsRepository extends JpaRepository<Character, Long> {
	
}