import { Component, OnInit } from '@angular/core';
import { InformationAPIService } from '../../information-api.service'

@Component({
  selector: 'app-client-view-video-games',
  templateUrl: './client-view-video-games.component.html',
  styleUrls: ['./client-view-video-games.component.sass']
})
export class ClientViewVideoGamesComponent implements OnInit {
  videoGames: any = [];
  clientIdentificationNumber = "";

  constructor(protected informationAPIService: InformationAPIService) { }

  handleSubmit(event: any) {
    event.preventDefault();
    this.informationAPIService.getVideoGamesByClient(this.clientIdentificationNumber)
      .subscribe(data => {
        this.videoGames = data;
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
