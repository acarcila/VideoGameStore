import { RentalAPIService } from './../../rental-api.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-create-client-view',
  templateUrl: './create-client-view.component.html',
  styleUrls: ['./create-client-view.component.sass']
})
export class CreateClientViewComponent implements OnInit {

  constructor(protected rentalAPIService: RentalAPIService) { }

  submit(event: any, inputName: string, inputIdentificationNumber: string, inputEmail: string, inputPhoneNumber: string, inputAddress: string, inputBirthday: string) {    
    event.preventDefault();
    var birtdayTimestamp = Date.parse(inputBirthday)/1000;
    var client = {
      name: inputName,
      phoneNumber: inputPhoneNumber,
      address: inputAddress,
      email: inputEmail,
      birthdayTimestamp: birtdayTimestamp,
      identificationNumber: inputIdentificationNumber,
    };
    this.rentalAPIService.insertClient(client)
      .subscribe(data => {
        alert("Se creó el cliente");
      }, error => {
        console.log(error);
        alert("No pudo crearse el cliente");
      })
  }

  ngOnInit(): void {

  }

}
