import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { GlobalModule } from './global/global.module';
import { AccountModule } from './account/account.module';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    GlobalModule,
    AccountModule
  ],
  exports: [
    GlobalModule,
    AccountModule
  ]
})
export class LsModule { }
