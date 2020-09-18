import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MoreFrequentVideoGameComponent } from './more-frequent-video-game.component';

describe('MoreFrequentVideoGameComponent', () => {
  let component: MoreFrequentVideoGameComponent;
  let fixture: ComponentFixture<MoreFrequentVideoGameComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MoreFrequentVideoGameComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MoreFrequentVideoGameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
