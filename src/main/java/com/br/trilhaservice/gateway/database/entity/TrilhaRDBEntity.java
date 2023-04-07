package com.br.trilhaservice.gateway.database.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity(name = "trilha")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrilhaRDBEntity {

    @Id
    private String id;
    private String title;
    private String description;
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
    private String imageUrl;
    @Column(columnDefinition = "integer default 1")
    private int statusId;
    private Integer createdBy;

}
