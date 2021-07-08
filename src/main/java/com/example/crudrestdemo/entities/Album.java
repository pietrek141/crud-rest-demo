package com.example.crudrestdemo.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    int tracks;
    @ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="artist_id")
    Artist artist;
}
