package com.simplon.miniLearningTracker.models.enums;

public enum ResourcesStatus {
    TODO("à faire"),
    IN_PROGRESS("en cours"),
    DONE("fait");

    private final String status;

    ResourcesStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
