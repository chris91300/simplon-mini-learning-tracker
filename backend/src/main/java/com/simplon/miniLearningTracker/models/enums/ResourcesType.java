package com.simplon.miniLearningTracker.models.enums;

public enum ResourcesType {
    ARTICLE("article"),
    VIDEO("vidéo"),
    DOCUMENTATION("documentation"),
    COURSE("course"),
    OTHER("autre");

    private final String type;

    ResourcesType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
