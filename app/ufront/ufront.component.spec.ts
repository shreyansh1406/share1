import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UfrontComponent } from './ufront.component';

describe('UfrontComponent', () => {
  let component: UfrontComponent;
  let fixture: ComponentFixture<UfrontComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UfrontComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UfrontComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
