package com.ipiecoles.java.audio.audiotheque.model;

import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="title")
    private String title;

    @Column(name="artist_id")
    private Integer artist_id;

    @ManyToOne
    private Artist artist;

    public Album() {
    }

    public Album(Integer id, String title, Integer artist_id) {
        this.id = id;
        this.title = title;
        this.artist_id = artist_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(Integer artist_id) {
        this.artist_id = artist_id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Album{");
        sb.append("id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", artist_id='").append(artist_id).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Album)) return false;

        Album album = (Album) o;

        if (title != null ? !title.equals(album.title) : album.title != null) return false;
        if (artist_id != null ? !artist_id.equals(album.artist_id) : album.artist_id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, artist_id);
    }
}
