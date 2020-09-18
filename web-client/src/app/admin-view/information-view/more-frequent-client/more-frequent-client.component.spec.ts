import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MoreFrequentClientComponent } from './more-frequent-client.component';

describe('MoreFrequentClientComponent', () => {
  let component: MoreFrequentClientComponent;
  let fixture: ComponentFixture<MoreFrequentClientComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MoreFrequentClientComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MoreFrequentClientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
