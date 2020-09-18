import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FindVideoGamesComponent } from './find-video-games.component';

describe('FindVideoGamesComponent', () => {
  let component: FindVideoGamesComponent;
  let fixture: ComponentFixture<FindVideoGamesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FindVideoGamesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FindVideoGamesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
