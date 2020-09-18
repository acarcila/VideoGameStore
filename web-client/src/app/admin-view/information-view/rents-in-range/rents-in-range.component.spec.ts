import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentsInRangeComponent } from './rents-in-range.component';

describe('RentsInRangeComponent', () => {
  let component: RentsInRangeComponent;
  let fixture: ComponentFixture<RentsInRangeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RentsInRangeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RentsInRangeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
