import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {
  private urlApi = environment.urlApi;

  constructor(private http: HttpClient) { }

  getAllProducts() {
    return this.http.get<any>(`${this.urlApi}/products`)
  }
}
