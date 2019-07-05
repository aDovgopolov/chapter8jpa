package com.apress.prospring5.ch8.jpaFirstPart.service;

import com.apress.prospring5.ch8.jpaFirstPart.entities.Album;
import com.apress.prospring5.ch8.jpaFirstPart.entities.Singer;

import java.util.List;

public interface AlbumService {
    List<Album> findBySinger(Singer singer);

    List<Album> findByTitle(String title);
}
