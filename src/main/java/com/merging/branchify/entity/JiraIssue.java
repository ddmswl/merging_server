package com.merging.branchify.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class JiraIssue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String issueId;

    private String summary;
    private String status;
    private String assignee;
    private LocalDateTime updatedAt;
    private String projectKey;
}
