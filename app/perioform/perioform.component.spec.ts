import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PerioformComponent } from './perioform.component';

describe('PerioformComponent', () => {
  let component: PerioformComponent;
  let fixture: ComponentFixture<PerioformComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PerioformComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PerioformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
