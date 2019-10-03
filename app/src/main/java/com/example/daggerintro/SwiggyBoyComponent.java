package com.example.daggerintro;

import com.example.daggerintro.homes.EbinHomeActivity;
import com.example.daggerintro.homes.KiranHomeActivity;
import com.example.daggerintro.hotel.DhabaModule;
import com.example.daggerintro.scope.SwiggyScope;

import dagger.Component;

@SwiggyScope
@Component(modules = DhabaModule.class)
public interface SwiggyBoyComponent {
    void inject(EbinHomeActivity target );
    void inject(KiranHomeActivity target );
}
