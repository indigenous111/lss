import { Component, OnInit } from '@angular/core';
import { ManageserviceService } from './manageservice.service';

@Component({
  selector: 'app-manage',
  templateUrl: './manage.component.html',
  styleUrls: ['./manage.component.scss']
})
export class ManageComponent implements OnInit {

  heroTypes:string[];



  constructor(private manageserviceService:ManageserviceService) {

  }

  ngOnInit() {
    providers:[ManageserviceService]
    this.heroTypes = this.manageserviceService.getHeroTypes();
  }

}
