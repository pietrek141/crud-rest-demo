package com.example.crudrestdemo.controller;

import com.example.crudrestdemo.entities.Artist;
import com.example.crudrestdemo.exceptons.EmptyInputException;
import com.example.crudrestdemo.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artists")
@RequiredArgsConstructor
public class ArtistController {

    private final ArtistService artistService;

    @GetMapping()
        public ResponseEntity<List<Artist>> getAllArtist(){
        List <Artist> listOfAllArtists = artistService.findAllArtist();
        return new ResponseEntity<>(listOfAllArtists, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Artist> getArtistById(@PathVariable long id){
        Artist artist = artistService.findById(id);
        return new ResponseEntity<>(artist, HttpStatus.OK);
    }

    @PostMapping()
        public ResponseEntity<Artist> addArtist(@RequestBody Artist artist) throws EmptyInputException {
        Artist savedArtist = artistService.addArtist(artist);
        return new ResponseEntity<>(savedArtist, HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<Artist> updateArtist(@RequestBody Artist artist) throws EmptyInputException {
        Artist updatedArtist = artistService.addArtist(artist);
        return new ResponseEntity<>(updatedArtist, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArtist(@PathVariable long id) throws EmptyInputException {
        artistService.deleteArtist(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
