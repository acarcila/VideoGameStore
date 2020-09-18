import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class InformationAPIService {
  service = 'http://localhost:8088/information_service';
  constructor(protected http: HttpClient) { }

  getRentalsByClient(identificationNumber: string)
  {
    return this.http.get(`${this.service}/rentals/by_client/${identificationNumber}`);
  }

  getVideoGamesByClient(identificationNumber: string)
  {
    return this.http.get(`${this.service}/video_games/by_client/${identificationNumber}`);
  }

  getVideoGame(identificationNumber: string)
  {
    return this.http.get(`${this.service}/video_game/${identificationNumber}`);
  }

  getMostRentedVideoGame()
  {
    return this.http.get(`${this.service}/video_games/order_by_rentals/1`);
  }

  getVideoGamesByDirector(directorName: string)
  {
    return this.http.get(`${this.service}/video_games/by_director/${directorName}`);
  }

  getVideoGamesByProducer(producerName: string)
  {
    return this.http.get(`${this.service}/video_games/by_producer/${producerName}`);
  }

  getGamesByCharacter(characterName: string)
  {
    return this.http.get(`${this.service}/video_games/by_character/${characterName}`);
  }

  getGamesByCompany(companyName: string)
  {
    return this.http.get(`${this.service}/video_games/by_company/${companyName}`);
  }

  getMostFrequentClient()
  {
    return this.http.get(`${this.service}/clients/orderByRentals/1`);
  }
  
  getRentalsByTime(startTimestamp: number, endTimestamp: number)
  {
    return this.http.get(`${this.service}/rentals/time/${startTimestamp}/${endTimestamp}`);
  }
}
