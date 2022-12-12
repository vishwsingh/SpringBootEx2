package com.example.apidemo.Controller;

import com.example.apidemo.Entity.Album;
import com.example.apidemo.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private AlbumService albumService;
    @GetMapping("/album")
    private List<Album> getAlbum() {
        return this.albumService.getAllAlbum();
    }

    @RequestMapping("page")
    public String page(@RequestParam(value = "name", defaultValue = "world") String name) {
        return "<HTML><H1>This is beautiful</H1><HTML>" + name;
    }

    @GetMapping("/albums")
    public List<Album> getCourses() {
        return this.albumService.getAllAlbum();
    }

    @GetMapping("/albums/{albumArtist}")
    public Album getCourse(@PathVariable String albumArtist) {
        return this.albumService.getAlbumByArtist(albumArtist);
    }

    @PostMapping("/albums")
    public Album addCourse(@RequestBody Album album) {
        return this.albumService.addAlbum(album);
    }

    @PutMapping("/albums")
    public Album updateCourse(@RequestBody Album album) {
        return this.albumService.updateAlbum(album);
    }

    @DeleteMapping("/albums/{albumArtist}")
    public String deleteCourse(@PathVariable String albumArtist) {
        return this.albumService.deleteAlbum(albumArtist);
    }
}
