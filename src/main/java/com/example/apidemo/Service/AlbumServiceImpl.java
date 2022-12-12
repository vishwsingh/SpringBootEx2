package com.example.apidemo.Service;

import com.example.apidemo.Entity.Album;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    List<Album> list;

    public AlbumServiceImpl() {
        list = new ArrayList<>();
        list.add(new Album(10,"Artist1","HipHop"));
        list.add(new Album(10,"Artist2","Classical"));

    }

    @Override
    public List<Album> getAllAlbum() {
        return list;
    }

    @Override
    public Album addAlbum(Album album) {
        this.list.add(album);
        return album;
    }

    @Override
    public Album getAlbumByArtist(String albumArtist) {

        Album c = null;

        for(Album album:list) {
            if(album.getArtist() == albumArtist) {
                c = album;
                break;
            }
        }
        return c;
    }

    @Override
    public Album updateAlbum(Album album) {

        Album c = null;
        for(Album album1:list) {
            if(album1.getArtist() == album.getArtist()) {
                album.setArtist(album.getArtist());
                album.setGenre(album.getGenre());
                album.setNumber_of_Songs(album.getNumber_of_Songs());
                c = album1;
                break;
            }
        }
        return null;
    }

    @Override
    public String deleteAlbum(String albumArtist) {

        for(Album album:list) {
            if(album.getArtist() == albumArtist) {
                list.remove(album);
                break;
            }
        }
        return "Deleted Successfully";
    }
}
