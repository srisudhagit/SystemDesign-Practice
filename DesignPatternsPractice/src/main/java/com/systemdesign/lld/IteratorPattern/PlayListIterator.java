package com.systemdesign.lld.IteratorPattern;

public class PlayListIterator implements Iterable<String>{
    PlayList playList;
    int pos=0;

    public PlayListIterator(PlayList pl){
        this.playList = pl;
    }

    @Override
    public boolean hasNext() {
       return pos < playList.getSize();
    }

    @Override
    public String next() {
        return playList.getSongAt(pos++);
    }
    
}
