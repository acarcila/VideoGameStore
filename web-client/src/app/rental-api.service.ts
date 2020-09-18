import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RentalAPIService {
  service = 'http://localhost:8088/rental_service';
  constructor(protected http: HttpClient) { }

  insertClient(client: any) {
    return this.http.post(`${this.service}/client`, client);
  }

  insertRental(rental: any) {
    return this.http.post(`${this.service}/rental`, rental);
  }

  updateVideoGame(videoGame: any) {
    return this.http.put(`${this.service}/video_game`, videoGame);
  }
}
