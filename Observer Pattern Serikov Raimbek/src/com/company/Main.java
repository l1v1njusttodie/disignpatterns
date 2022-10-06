package com.company;

public class Main {

    public static void main(String[] args) {
	AnimeSite shikimori = new AnimeSite();
    Person raimbek = new Person("Raimbek");
    shikimori.addAnime("Naruto");
    shikimori.addObserver(raimbek);
    shikimori.addAnime("One Piece");

    shikimori.removeAnime("Naruto");
    }
}
