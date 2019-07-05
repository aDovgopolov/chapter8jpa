package com.apress.prospring5.ch8.jpaFirstPart.service;

import com.apress.prospring5.ch8.jpaFirstPart.entities.Album;
import com.apress.prospring5.ch8.jpaFirstPart.entities.Singer;
import com.apress.prospring5.ch8.jpaFirstPart.repos.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("springJpaAlbumService")
@Transactional
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumRepository albumRepository;


//    public void setAlbumRepository(AlbumRepository albumRepository) {
//        this.albumRepository = albumRepository;
//    }

    @Transactional
    @Override
    public List<Album> findBySinger(Singer singer) {
        return albumRepository.findBySinger(singer);
    }

    @Transactional
    @Override
    public List<Album> findByTitle(String title) {
        return albumRepository.findByTitle(title);
    }
}
