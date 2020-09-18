import { ClientViewVideoGamesComponent } from './client-view/client-view-video-games/client-view-video-games.component';
import { ClientViewRentalsComponent } from './client-view/client-view-rentals/client-view-rentals.component';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminViewComponent } from './admin-view/admin-view.component';
import { ClientViewComponent } from './client-view/client-view.component';
import { InformationAPIService } from './information-api.service';
import { CreateClientViewComponent } from './admin-view/create-client-view/create-client-view.component';
import { CreateRentalViewComponent } from './admin-view/create-rental-view/create-rental-view.component';
import { InformationViewComponent } from './admin-view/information-view/information-view.component';
import { MoreFrequentClientComponent } from './admin-view/information-view/more-frequent-client/more-frequent-client.component';
import { MoreFrequentVideoGameComponent } from './admin-view/information-view/more-frequent-video-game/more-frequent-video-game.component';
import { RentsInRangeComponent } from './admin-view/information-view/rents-in-range/rents-in-range.component';
import { FindVideoGamesComponent } from './admin-view/information-view/find-video-games/find-video-games.component';

@NgModule({
  declarations: [
    AppComponent,
    ClientViewComponent,
    AdminViewComponent,
    ClientViewRentalsComponent,
    ClientViewVideoGamesComponent,
    CreateClientViewComponent,
    CreateRentalViewComponent,
    InformationViewComponent,
    MoreFrequentClientComponent,
    MoreFrequentVideoGameComponent,
    RentsInRangeComponent,
    FindVideoGamesComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [InformationAPIService],
  bootstrap: [AppComponent]
})
export class AppModule { }
