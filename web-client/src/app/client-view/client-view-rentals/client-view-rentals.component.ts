import { element } from 'protractor';
import { mapToMapExpression } from '@angular/compiler/src/render3/util';
import { Component, OnInit } from '@angular/core';
import { InformationAPIService } from '../../information-api.service'

@Component({
  selector: 'app-client-view-rentals',
  templateUrl: './client-view-rentals.component.html',
  styleUrls: ['./client-view-rentals.component.sass']
})
export class ClientViewRentalsComponent implements OnInit {

  rentals: any = [];
  clientIdentificationNumber = "";

  constructor(protected informationAPIService: InformationAPIService) { }

  handleSubmit(event: any) {
    event.preventDefault();
    this.informationAPIService.getRentalsByClient(this.clientIdentificationNumber)
      .subscribe(data => {
        this.rentals = data;
        console.log(data);
        this.clientIdentificationNumber = "";
        this.rentals = this.rentals.map((element) => {
          element.date = new Date(element['timestamp'] * 1000)
          return element;
        });
      }, error => {
        console.log(error);
      })
    this.clientIdentificationNumber = "";
  }

  onInputChange(value: string) {
    this.clientIdentificationNumber = value;
  }

  ngOnInit(): void {
  }

}
