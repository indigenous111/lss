import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NestedModule } from './nested/nested.module';



@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    NestedModule
  ],
  exports: [
    NestedModule
  ]
})
export class MenuModule { }
