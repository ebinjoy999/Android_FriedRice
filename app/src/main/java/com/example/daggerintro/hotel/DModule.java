package com.example.daggerintro.hotel;

import com.example.daggerintro.menu.FriedRice;

import dagger.Module;
import dagger.Provides;

@Module
public class DModule {

  @Provides
  FriedRice getVegFriedRice(){
   return new FriedRice(FriedRice.VEG_FRIED_RICE);
  }

}
