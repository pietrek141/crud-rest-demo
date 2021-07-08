package com.example.crudrestdemo.service;

import com.example.crudrestdemo.entities.Artist;
import com.example.crudrestdemo.exceptons.EmptyInputException;
import com.example.crudrestdemo.repo.ArtistRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArtistService {

    private final ArtistRepo artistRepo;
    
    public List<Artist> findAllArtist(){
        return artistRepo.findAll();
    }

    public Artist addArtist(Artist artist) throws EmptyInputException {
        if (artist.getName().isEmpty() || artist.getName().length() == 0){
            throw new EmptyInputException("Input fields cannot be empty", "601");
        }
        return artistRepo.save(artist);
    }

    public Artist findById(long id) {
        Optional<Artist> optionalArtist = artistRepo.findById(id);
        return optionalArtist.orElseThrow(() -> new IllegalArgumentException("There is no artist with this id"));
    }

    public void deleteArtist(long id) {
        artistRepo.deleteById(id);
    }
}
