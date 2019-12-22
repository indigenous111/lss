import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { GlobalComponent } from './global/global.component';
import { TypeModule } from './hero/type/type.module';



@NgModule({
  declarations: [GlobalComponent],
  imports: [
    CommonModule
  ]
})
export class GlobalModule { }
