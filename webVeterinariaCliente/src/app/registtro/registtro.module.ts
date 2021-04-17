import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { RegisttroPageRoutingModule } from './registtro-routing.module';

import { RegisttroPage } from './registtro.page';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    RegisttroPageRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  declarations: [RegisttroPage]
})
export class RegisttroPageModule {}
