package com.simplon.miniLearningTracker.repositories;

import java.util.UUID;


import org.springframework.data.jpa.repository.JpaRepository;

import com.simplon.miniLearningTracker.models.Resource;

public interface ResourceRepository extends JpaRepository<Resource, UUID>  {

}
