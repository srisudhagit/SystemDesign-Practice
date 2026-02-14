package com.systemdesign.lld.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements IterableCollection<String>{
    List<String> songs;
    Iterable<String> songIterator;

    public PlayList(){
        this.songs = new ArrayList<>();
    }

    public void addSong(String song){
        songs.add(song);
    }

    public String getSongAt(int index){
        return songs.get(index);
    }

    public int getSize(){
        return songs.size();
    }

    @Override
    public Iterable<String> createInterator() {
       this.songIterator = new PlayListIterator(this);
       return this.songIterator;
    }
    
}
