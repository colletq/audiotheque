package com.ipiecoles.java.audio.audiotheque;

import com.ipiecoles.java.audio.audiotheque.model.Album;
import com.ipiecoles.java.audio.audiotheque.model.Artist;
import com.ipiecoles.java.audio.audiotheque.repository.AlbumRepository;
import com.ipiecoles.java.audio.audiotheque.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public void run(String... strings) throws Exception {
        Album album;
        List<Album> albums;

        Artist artist;
        List<Artist> artists;

        artist = artistRepository.findByName("Nirvana");
        print(artist + "\n");

        artist = artistRepository.findByNameIgnoreCase("oZZy OsBoUrNE");
        print(artist + "\n");

        artists = artistRepository.findByNameStartingWith("P");
        for (Integer i = 0; i < artists.size(); i++)
        {
            print(artists.get(i));
        }
        print("\n");

        artists = artistRepository.findByNameContainingIgnoreCase("mai");
        for (Integer i = 0; i < artists.size(); i++)
        {
            print(artists.get(i));
        }
        print("\n");


    }

    public static void print(Object t) {
        System.out.println(t);
    }
}
