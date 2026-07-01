package com.simplon.miniLearningTracker.models.enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class ResourcesStatusConverter implements AttributeConverter<ResourcesStatus, String> {
    @Override
    public String convertToDatabaseColumn(ResourcesStatus resourcesStatus) {
        if (resourcesStatus == null) {
            return null;
        }
        return resourcesStatus.getStatus();
    }

    @Override
    public ResourcesStatus convertToEntityAttribute(String resourcesStatus) {
        if (resourcesStatus == null) {
            return null;
        }

        return Stream.of(ResourcesStatus.values())
                .filter(c -> c.getStatus().equals(resourcesStatus))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
