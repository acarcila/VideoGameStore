import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClientViewRentalsComponent } from './client-view-rentals.component';

describe('ClientViewRentalsComponent', () => {
  let component: ClientViewRentalsComponent;
  let fixture: ComponentFixture<ClientViewRentalsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ClientViewRentalsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ClientViewRentalsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
