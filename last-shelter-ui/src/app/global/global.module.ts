import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { MenuModule } from './menu/menu.module';



@NgModule({
  declarations: [HeaderComponent, FooterComponent],
  imports: [
    CommonModule,
    MenuModule
  ],
  exports: [
    HeaderComponent,
    MenuModule
  ]
})
export class GlobalModule { }
