import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { RegisttroPage } from './registtro.page';

const routes: Routes = [
  {
    path: '',
    component: RegisttroPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class RegisttroPageRoutingModule {}
