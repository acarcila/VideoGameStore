import { InformationAPIService } from './../../../information-api.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-rents-in-range',
  templateUrl: './rents-in-range.component.html',
  styleUrls: ['./rents-in-range.component.sass']
})
export class RentsInRangeComponent implements OnInit {

  rentals: any = [];

  constructor(protected informationAPIService: InformationAPIService) {}

  submit(event: any, inputMin: string, inputMax: string) {
    event.preventDefault();
    var min = Date.parse(inputMin)/1000;
    var max = (Date.parse(inputMax)/1000)+86400;
    this.informationAPIService.getRentalsByTime(min, max)
      .subscribe(data => {
        console.log(data);
        this.rentals = data
      }, error => {
        console.log(error);
      })
  }

  ngOnInit(): void {

  }

}
