package com.sfc.javocab.audioCap;

import java.io.Serializable;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ViewScoped
@Named
public class Home implements Serializable {

    MidiaCap midiaCap;

    @PostConstruct
    public void init() {
        midiaCap = new MidiaCap();
        midiaCap.setMidia("test.mp3");
        midiaCap.setCaption("audio.mp3");
    }
}
