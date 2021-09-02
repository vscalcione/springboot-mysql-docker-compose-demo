package it.vscalcione.springboot.docker.mysql.demoapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.vscalcione.springboot.docker.mysql.demoapplication.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long>{
	
	List<Tutorial> findByPublished(boolean published);
	List<Tutorial> findByTitleContaining(String title);
}
