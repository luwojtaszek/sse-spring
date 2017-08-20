import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/Rx';
import { OfferService } from './components/shared';
import { Offer } from './components/shared';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'app';
  offer: Observable<Offer>;

  constructor(private offerService: OfferService) {
  }
  ngOnInit() {
    this.offer = this.offerService.getHiglightedOffer().share();
  }
}
