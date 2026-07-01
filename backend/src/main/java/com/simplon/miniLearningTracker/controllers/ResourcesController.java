package com.simplon.miniLearningTracker.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.jspecify.annotations.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.simplon.miniLearningTracker.models.Resource;
import com.simplon.miniLearningTracker.services.ResourceService;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/resources")
public class ResourcesController {
    private ResourceService resourceService;

    public ResourcesController(ResourceService resourceService){
        this.resourceService = resourceService;
    }


    @GetMapping()
    public List<Resource> getResources(){
        return this.resourceService.findAll();
    }


    @GetMapping("/{resourceId}")
    public Resource getResourceWithId(@PathVariable("resourceId") UUID id){
        return this.resourceService.findById(id);
    }

    @PostMapping()
    public ResponseEntity<@NonNull Resource> createResource(@RequestBody Resource resource) {
        Resource resourceCreated = this.resourceService.create(resource);
        return new ResponseEntity<@NonNull Resource>(resourceCreated, HttpStatus.CREATED);
    }
    
    
    
}