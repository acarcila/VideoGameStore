import { InformationAPIService } from './../../information-api.service';
import { RentalAPIService } from './../../rental-api.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-create-rental-view',
  templateUrl: './create-rental-view.component.html',
  styleUrls: ['./create-rental-view.component.sass']
})
export class CreateRentalViewComponent implements OnInit {

  constructor(protected rentalAPIService: RentalAPIService, protected informationAPIService: InformationAPIService) { }

  submit(event: any, inputIdClient: string, inputIdVideoGame: string, inputDays: number) {
    event.preventDefault();
    this.informationAPIService.getVideoGame(inputIdVideoGame)
      .subscribe(dataVideoGame => {
        console.log(dataVideoGame['rentalPrice']);
        var rental = {
          timestamp: Math.round(Date.now() / 1000),
          duration: inputDays * 86400,
          price: dataVideoGame["rentalPrice"],
          isReturned: false,
          fkClient: inputIdClient,
          fkVideoGame: inputIdVideoGame
        };
        console.log(rental);
        this.rentalAPIService.insertRental(rental)
          .subscribe(data => {
            alert("Se creó el cliente");
          }, error => {
            console.log(error);
            alert("No pudo crearse el alquiler");
          })

      }, error => {
        console.log(error);
        alert("No se encontró el videojuego");
      })
  }

  ngOnInit(): void {
  }

}
