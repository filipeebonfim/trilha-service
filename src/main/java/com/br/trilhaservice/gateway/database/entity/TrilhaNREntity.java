package com.br.trilhaservice.gateway.database.entity;

import com.br.trilhaservice.core.model.Module;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Document("trilha")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrilhaNREntity {

    @Id
    private String id;
    private String title;
    private String description;
    private String imageUrl;
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
    private List<Integer> skills;
    private List<Integer> competences;
    private Map<String, Module> modules;
    private List<Integer> firstModules;
    private List<Integer> subjects;

}
