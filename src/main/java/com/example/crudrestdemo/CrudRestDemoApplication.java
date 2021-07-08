package com.example.crudrestdemo;

import com.example.crudrestdemo.controller.ArtistController;
import com.example.crudrestdemo.entities.Album;
import com.example.crudrestdemo.entities.Artist;
import com.example.crudrestdemo.exceptons.EmptyInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TODO spring profiles: prod/dev
//TODO fill in REST methods
//tests
//TODO security?:roles,login
@SpringBootApplication
public class CrudRestDemoApplication {
    static
    ArtistController artistController;

    public CrudRestDemoApplication(ArtistController artistController) {
        CrudRestDemoApplication.artistController = artistController;
    }

    public static void main(String[] args) {
        SpringApplication.run(CrudRestDemoApplication.class, args);
    }

}
