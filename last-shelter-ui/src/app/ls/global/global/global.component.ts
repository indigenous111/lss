import { Component, OnInit } from '@angular/core';
import { NestedmenuComponent } from '../../../global/menu/nested/nestedmenu/nestedmenu.component';

@Component({
  selector: 'app-global',
  templateUrl: './global.component.html',
  styleUrls: ['./global.component.scss']
})
export class GlobalComponent implements OnInit {
  title = "Global Menu";
  constructor() { }

  ngOnInit() {
  }

}
