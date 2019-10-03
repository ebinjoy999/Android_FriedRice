package com.example.daggerintro;

import com.example.daggerintro.homes.EbinHomeActivity;
import com.example.daggerintro.hotel.DhabaModule;

import dagger.Component;

@Component(modules = DhabaModule.class)
public interface SwiggyBoyComponent {
    void inject(EbinHomeActivity target );
}
