package com.example.crudrestdemo.service;

import com.example.crudrestdemo.entities.Album;
import com.example.crudrestdemo.exceptons.EmptyInputException;
import com.example.crudrestdemo.repo.AlbumRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlbumService {

    private final AlbumRepo albumRepo;
    
    public List<Album> findAllAlbums(){
        return albumRepo.findAll();
    }

    public Album addAlbum(Album album) throws EmptyInputException {
        if (album.getName().isEmpty() || album.getName().length() == 0){
            throw new EmptyInputException("Input fields cannot be empty");
        }
        return albumRepo.save(album);
    }

    public Album findById(long id) {
        Optional<Album> optionalAlbum = albumRepo.findById(id);
        return optionalAlbum.orElseThrow(() -> new IllegalArgumentException("There is no album with this id"));
    }

    public void deleteAlbum(long id) {
        albumRepo.deleteById(id);
    }
}
