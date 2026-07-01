package com.simplon.miniLearningTracker.models;

import java.util.Date;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
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
    private Date createdAt;

    @ManyToOne
    private Category category;
    
}


