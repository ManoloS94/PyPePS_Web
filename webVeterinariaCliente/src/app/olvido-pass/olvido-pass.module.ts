import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { OlvidoPassPageRoutingModule } from './olvido-pass-routing.module';

import { OlvidoPassPage } from './olvido-pass.page';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ReactiveFormsModule,
    OlvidoPassPageRoutingModule,
    HttpClientModule
  ],
  declarations: [OlvidoPassPage]
})
export class OlvidoPassPageModule {}
