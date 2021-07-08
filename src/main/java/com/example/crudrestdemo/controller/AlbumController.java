package com.example.crudrestdemo.controller;

import com.example.crudrestdemo.entities.Album;
import com.example.crudrestdemo.entities.Artist;
import com.example.crudrestdemo.exceptons.EmptyInputException;
import com.example.crudrestdemo.service.AlbumService;
import com.example.crudrestdemo.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/albums")
@RequiredArgsConstructor
public class AlbumController {

    private final AlbumService albumService;

    @GetMapping()
        public ResponseEntity<List<Album>> getAllAlbums(){
        List <Album> listOfAllAlbums = albumService.findAllAlbums();
        return new ResponseEntity<>(listOfAllAlbums, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Album> getAlbumById(@PathVariable long id){
        Album album = albumService.findById(id);
        return new ResponseEntity<>(album, HttpStatus.OK);
    }

    @PostMapping()
        public ResponseEntity<Album> addAlbum(@RequestBody Album album) throws EmptyInputException {
        Album savedAlbum = albumService.addAlbum(album);
        return new ResponseEntity<>(savedAlbum, HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<Album> updateAlbum(@RequestBody Album album) throws EmptyInputException {
        Album updatedAlbum = albumService.addAlbum(album);
        return new ResponseEntity<>(updatedAlbum, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAlbum(@PathVariable long id) throws EmptyInputException {
        albumService.deleteAlbum(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
