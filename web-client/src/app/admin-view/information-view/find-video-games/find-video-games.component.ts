import { InformationAPIService } from './../../../information-api.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-find-video-games',
  templateUrl: './find-video-games.component.html',
  styleUrls: ['./find-video-games.component.sass']
})
export class FindVideoGamesComponent implements OnInit {

  searchBy: string = "";
  videoGames: any = [];

  constructor(protected informationAPIService: InformationAPIService) {}

  submit(event: any, inputSearch: string) {
    event.preventDefault();
    var search;
    switch (this.searchBy) {
      case "director":
        search = this.informationAPIService.getVideoGamesByDirector(inputSearch);
        break;
      case "character":
        search = this.informationAPIService.getGamesByCharacter(inputSearch);
        break;
      case "producer":
        search = this.informationAPIService.getVideoGamesByDirector(inputSearch);
        break;
      case "company":
        search = this.informationAPIService.getGamesByCompany(inputSearch);
        break;
      default:
        break;
    }
    search
      .subscribe(data => {
        console.log(data);
        this.videoGames = data
      }, error => {
        console.log(error);
      })
  }

  selectChangeHandler(event: any){
    this.searchBy = event.target.value;
  }

  ngOnInit(): void {

  }

}
