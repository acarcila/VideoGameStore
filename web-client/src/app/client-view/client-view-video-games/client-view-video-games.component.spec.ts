import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClientViewVideoGamesComponent } from './client-view-video-games.component';

describe('ClientViewVideoGamesComponent', () => {
  let component: ClientViewVideoGamesComponent;
  let fixture: ComponentFixture<ClientViewVideoGamesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ClientViewVideoGamesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ClientViewVideoGamesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
