package com.simplon.miniLearningTracker.models;

import java.time.Instant;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;
import com.simplon.miniLearningTracker.models.enums.ResourcesStatus;
import com.simplon.miniLearningTracker.models.enums.ResourcesType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "resource")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) 
    private UUID id;

    @Column(length = 255, nullable = false)
    private String title;
 
    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String url;

    @Enumerated(EnumType.STRING)
    private ResourcesType type;

    @Enumerated(EnumType.STRING)
    private ResourcesStatus status;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)    
    private Instant createdAt;

    @ManyToOne
    private Category category;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ResourcesType getType() {
        return type;
    }

    public void setType(ResourcesType type) {
        this.type = type;
    }

    public ResourcesStatus getStatus() {
        return status;
    }

    public void setStatus(ResourcesStatus status) {
        this.status = status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    
    
}


