package com.andriiiiiko.spring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;
}
