package com.example.daggerintro;

import com.example.daggerintro.homes.EbinHomeActivity;
import com.example.daggerintro.hotel.DModule;

import dagger.Component;

@Component(modules = DModule.class)
public interface SComponent {
    void inject(EbinHomeActivity target );
}
