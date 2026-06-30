package com.simplon.miniLearningTracker.models.enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class ResourcesTypeConverter implements AttributeConverter<ResourcesType, String> {
    @Override
    public String convertToDatabaseColumn(ResourcesType resourcesType) {
        if (resourcesType == null) {
            return null;
        }
        return resourcesType.getType();
    }

    @Override
    public ResourcesType convertToEntityAttribute(String resourcesType) {
        if (resourcesType == null) {
            return null;
        }

        return Stream.of(ResourcesType.values())
                .filter(c -> c.getType().equals(resourcesType))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
