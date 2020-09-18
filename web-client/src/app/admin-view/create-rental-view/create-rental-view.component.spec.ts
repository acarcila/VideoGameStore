import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateRentalViewComponent } from './create-rental-view.component';

describe('CreateRentalViewComponent', () => {
  let component: CreateRentalViewComponent;
  let fixture: ComponentFixture<CreateRentalViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateRentalViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateRentalViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
