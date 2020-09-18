import { TestBed } from '@angular/core/testing';

import { RentalAPIService } from './rental-api.service';

describe('RentalAPIService', () => {
  let service: RentalAPIService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RentalAPIService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
