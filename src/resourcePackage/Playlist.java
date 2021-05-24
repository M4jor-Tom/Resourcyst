package com.example.androidmusyst.Resourcyst.src.resourcePackage;

import java.util.ArrayList;
import java.util.List;

public class Playlist
{
    private long _id;
    private String _name;
    private List<Playlist> _playlists;
    private List<Author> _authors;
    private List<Album> _albums;
    private List<MusicResource> _musicResources;

    public Playlist(
            long id,
            String name,
            List<Playlist> playlists,
            List<Author> authors,
            List<Album> albums,
            List<MusicResource> musicResources
    )
    {
        setId(id);
        setName(name);
        setPlaylists(new ArrayList<>());
        setPlaylists(playlists);
        setAuthors(new ArrayList<>());
        setAuthors(authors);
        setAlbums(new ArrayList<>());
        setAlbums(albums);
        setMusicResources(new ArrayList<>());
        setMusicResources(musicResources);
    }

    public Playlist(long id, String name)
    {
        this(id, name, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }

    public Playlist(String name)
    {
        this(Resource.UNDEFINED_ID, name, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }

    public long getId()
    {
        return _id;
    }

    public void setId(long id)
    {
        _id = id;
    }

    public String getName()
    {
        return _name;
    }

    public void setName(String name)
    {
        _name = name;
    }

    public List<Playlist> getPlaylists()
    {
        return _playlists;
    }

    public void setPlaylists(List<Playlist> playlists)
    {
        _playlists = playlists;
    }

    public List<Author> getAuthors()
    {
        return _authors;
    }

    public void setAuthors(List<Author> authors)
    {
        _authors = _authors;
    }

    public List<Album> getAlbums()
    {
        return _albums;
    }

    public void setAlbums(List<Album> albums)
    {
        _albums = albums;
    }

    public List<MusicResource> getMusicResources()
    {
        return _musicResources;
    }

    public void setMusicResources(List<MusicResource> musicResources)
    {
        _musicResources = musicResources;
    }
}