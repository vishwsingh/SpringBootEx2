package com.example.apidemo.Service;

import com.example.apidemo.Entity.Album;

import java.util.List;

public interface AlbumService {

    List<Album> getAllAlbum();
    Album addAlbum(Album album);
    Album getAlbumByArtist(String albumArtist);
    Album updateAlbum(Album album);
    String deleteAlbum(String albumArtist);
}
