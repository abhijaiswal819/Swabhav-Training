import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { KmToMeterPipe } from './pipes/km-to-meter.pipe';
import { UsdToInrPipe } from './pipes/usd-to-inr.pipe';

@NgModule({
  declarations: [
    AppComponent,
    KmToMeterPipe,
    UsdToInrPipe
  ],
  imports: [
    BrowserModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
