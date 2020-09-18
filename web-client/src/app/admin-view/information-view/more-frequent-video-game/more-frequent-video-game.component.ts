import { InformationAPIService } from './../../../information-api.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-more-frequent-video-game',
  templateUrl: './more-frequent-video-game.component.html',
  styleUrls: ['./more-frequent-video-game.component.sass']
})
export class MoreFrequentVideoGameComponent implements OnInit {

  videoGame: any = {};

  constructor(protected informationAPIService: InformationAPIService) { }

  ngOnInit(): void {
    this.informationAPIService.getMostRentedVideoGame()
      .subscribe(data => {
        console.log(data);
        this.videoGame = data[0];
      }, error => {
        console.log(error);
      })
  }

}
