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
}
