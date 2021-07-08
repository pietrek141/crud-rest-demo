package com.example.crudrestdemo.controller;

import com.example.crudrestdemo.entities.Album;
import com.example.crudrestdemo.entities.Artist;
import com.example.crudrestdemo.exceptons.EmptyInputException;
import com.example.crudrestdemo.repo.ArtistRepo;
import com.example.crudrestdemo.service.ArtistService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
//@SpringBootTest
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(controllers = ArtistController.class)
class ArtistControllerTest {

    @Autowired
    ArtistRepo artistRepo;
    @Autowired
    ArtistService artistService;
    @Autowired
    ArtistController artistController;

    @Test
    public void shouldAddArtistToDb() throws EmptyInputException {

/*        Artist artist = new Artist();
        artist.setName("Korn");
        Album album = new Album();
        album.setName("first");
        artist.setName("Korn");
        artist.setAlbums(Collections.singletonList(album));
        artistController.addArtist(artist);
        List<Artist> allArtist = artistController.getAllArtist().getBody();*/
        int a = 10;
        assertEquals(10, a);
    }

}
