package com.example.apidemo.Controller;

import com.example.apidemo.Entity.Album;
import com.example.apidemo.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private AlbumService albumService;
    @GetMapping("/album")
    private List<Album> getAlbum() {
        return this.albumService.getAllAlbum();
    }
}
