package com.solid.sample.example;

import com.solid.sample.example.model.FlamingGuitar;
import com.solid.sample.example.model.Guitar;
import com.solid.sample.example.service.GuitarMusicComposer;
import com.solid.sample.example.service.impl.GuitarMusicComposerImpl;

public class Main {

  public static void main(String[] args) {

    System.out.println("Let's learn open for extensions closed for modifications!");

    //create a guitar
    Guitar guitar = Guitar.builder().make("Fonder").color("blue").volume("high").build();
    //create a guitar music composer

    GuitarMusicComposer guitarMusicComposer = new GuitarMusicComposerImpl();
    //compose music
    guitarMusicComposer.composeGuitarMusic(guitar);

    FlamingGuitar flamingGuitar = FlamingGuitar.builder().make("YAMAHA").flamingColor("CRIMSON")
        .build();
    flamingGuitar.induceFlame(2);

    guitarMusicComposer.composeGuitarMusic(flamingGuitar);


  }
}
