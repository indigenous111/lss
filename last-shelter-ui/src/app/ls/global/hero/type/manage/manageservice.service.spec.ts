import { TestBed } from '@angular/core/testing';

import { ManageserviceService } from './manageservice.service';

describe('ManageserviceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ManageserviceService = TestBed.get(ManageserviceService);
    expect(service).toBeTruthy();
  });
});
