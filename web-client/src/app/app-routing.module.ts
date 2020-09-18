import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AdminViewComponent} from './admin-view/admin-view.component';
import {ClientViewComponent} from './client-view/client-view.component';

const routes: Routes = [
  {path: 'admin', component: AdminViewComponent},
  {path: 'client', component: ClientViewComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
