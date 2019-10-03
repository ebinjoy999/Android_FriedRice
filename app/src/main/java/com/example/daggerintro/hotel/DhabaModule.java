package com.example.daggerintro.hotel;

import com.example.daggerintro.menu.FriedRice;
import com.example.daggerintro.qualifier.CheckinFriedRice;
import com.example.daggerintro.qualifier.VegFriedRice;
import com.example.daggerintro.scope.SwiggyScope;

import dagger.Module;
import dagger.Provides;

@Module
public class DhabaModule {

  @VegFriedRice
  @SwiggyScope
  @Provides
  FriedRice getVegFriedRice(){
   return new FriedRice(FriedRice.VEG_FRIED_RICE);
  }

    private int index = 0;
    @CheckinFriedRice
    @SwiggyScope
    @Provides
    FriedRice getChickenFriedRice(){
       index++;
        return new FriedRice(FriedRice.CHICKEN_FRIED_RICE);
    }
}
