package com.harkue.crawler.libraries.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Platform {
    private String name;
    private String projectCount;
    private String homepage;
    private String color;
    private String defaultLanguage;
}
