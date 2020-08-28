package me.bruno.webflux.util;

import me.bruno.webflux.domain.Anime;

/**
 * @author bruno.alves.rocha
 */
public class AnimeCreator {

    public static Anime createAnimeToBeSaved() {
        return Anime.builder()
                .name("Tensei Shirata Slime Datta Ken")
                .build();
    }

    public static Anime createValidAnime() {
        return Anime.builder()
                .id(1)
                .name("Tensei Shirata Slime Datta Ken")
                .build();
    }

    public static Anime createValidUpdateAnime() {
        return Anime.builder()
                .id(1)
                .name("Tensei Shirata Slime Datta Ken 2")
                .build();
    }
}
