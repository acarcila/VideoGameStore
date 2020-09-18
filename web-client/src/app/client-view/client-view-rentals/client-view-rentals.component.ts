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
