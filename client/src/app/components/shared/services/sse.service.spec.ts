import { TestBed, inject } from '@angular/core/testing';

import { SseServiceService } from './sse.service';

describe('SseServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SseServiceService]
    });
  });

  it('should be created', inject([SseServiceService], (service: SseServiceService) => {
    expect(service).toBeTruthy();
  }));
});
