import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ManageserviceService {
  heroTypes:Array<string> = ["S1", "S2", "S3", "S4"];

  constructor() {

  }

  getHeroTypes() {
    return this.heroTypes;
  }
}
