import { InformationAPIService } from './../../../information-api.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-more-frequent-client',
  templateUrl: './more-frequent-client.component.html',
  styleUrls: ['./more-frequent-client.component.sass']
})
export class MoreFrequentClientComponent implements OnInit {

  client: any = {};

  constructor(protected informationAPIService: InformationAPIService) { }

  ngOnInit(): void {
    this.informationAPIService.getMostFrequentClient()
      .subscribe(data => {
        console.log(data);
        this.client = data[0];
      }, error => {
        console.log(error);
      })
  }

}
