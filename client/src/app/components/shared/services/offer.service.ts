import { Injectable, NgZone } from '@angular/core';
import { Observable } from 'rxjs/Rx';
import { Offer } from '../models';
import { SseService } from './sse.service';

@Injectable()
export class OfferService {
  private url = 'http://localhost:8080/offers/highlighted';

  constructor(private sseService: SseService, private zone: NgZone) {
  }

  getHiglightedOffer(): Observable<Offer> {
    return Observable.create(observer => {
      const eventSource: sse.IEventSourceStatic = this.sseService.createEventSource(this.url);
      eventSource.onmessage = (event) => {
        this.zone.run(() => observer.next(JSON.parse(event.data)));
      };
      eventSource.onerror = (error) => {
        observer.error(error);
      };
    });
  }

}
