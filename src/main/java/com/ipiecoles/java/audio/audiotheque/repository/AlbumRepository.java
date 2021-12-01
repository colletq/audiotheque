package com.ipiecoles.java.audio.audiotheque.repository;

import com.ipiecoles.java.audio.audiotheque.model.Album;
import com.ipiecoles.java.audio.audiotheque.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
    Album findByTitle(String title);
}