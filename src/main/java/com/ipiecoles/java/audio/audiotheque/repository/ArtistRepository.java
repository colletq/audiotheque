package com.ipiecoles.java.audio.audiotheque.repository;

import com.ipiecoles.java.audio.audiotheque.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {
    Artist findByName(String name);
    Artist findByNameIgnoreCase(String name);
    List<Artist> findByNameStartingWith(@Param("premiereLettre") String premiereLettre);
    List<Artist> findByNameContainingIgnoreCase(@Param("texte") String texte);
}