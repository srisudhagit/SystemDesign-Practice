package com.systemdesign.lld.IteratorPattern;

public class Client {
    public static void main(String[] args) {
        PlayList myFavSongs = new PlayList();
        myFavSongs.addSong("Chandamama");
        myFavSongs.addSong("Ninnu Vidisi");
        myFavSongs.addSong("Edo Okati");

        Iterable<String> myFavSongsIterator = myFavSongs.createInterator();
        while(myFavSongsIterator.hasNext()){
            System.out.println(myFavSongsIterator.next());
        }
    }
}
