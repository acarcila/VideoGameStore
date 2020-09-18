import { ClientViewVideoGamesComponent } from './client-view/client-view-video-games/client-view-video-games.component';
import { InformationViewComponent } from './admin-view/information-view/information-view.component';
import { CreateRentalViewComponent } from './admin-view/create-rental-view/create-rental-view.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AdminViewComponent} from './admin-view/admin-view.component';
import {ClientViewComponent} from './client-view/client-view.component';
import { CreateClientViewComponent } from './admin-view/create-client-view/create-client-view.component';
import { ClientViewRentalsComponent } from './client-view/client-view-rentals/client-view-rentals.component';

const routes: Routes = [
  {path: '', component: AdminViewComponent},
  {path: 'admin', component: AdminViewComponent},
  {path: 'admin/create_rental', component: CreateRentalViewComponent},
  {path: 'admin/create_client', component: CreateClientViewComponent},
  {path: 'admin/information', component: InformationViewComponent},
  {path: 'client', component: ClientViewComponent},
  {path: 'client/rentals', component: ClientViewRentalsComponent},
  {path: 'client/video_games', component: ClientViewVideoGamesComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
