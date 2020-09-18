import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateClientViewComponent } from './create-client-view.component';

describe('CreateClientViewComponent', () => {
  let component: CreateClientViewComponent;
  let fixture: ComponentFixture<CreateClientViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateClientViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateClientViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
