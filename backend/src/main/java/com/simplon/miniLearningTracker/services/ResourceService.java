package com.simplon.miniLearningTracker.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.simplon.miniLearningTracker.models.Resource;
import com.simplon.miniLearningTracker.repositories.ResourceRepository;

@Service
public class ResourceService {
private ResourceRepository  resourceRepository;

    public ResourceService(ResourceRepository resourceRepository){
        this.resourceRepository = resourceRepository;
    }

    public List<Resource> findAll(){
        return this.resourceRepository.findAll();
    }

    public Resource findById(UUID id){
        return this.resourceRepository.findById(id).get();
    }

    public Resource create(Resource resource) {
        return this.resourceRepository.save(resource);
    }

}
