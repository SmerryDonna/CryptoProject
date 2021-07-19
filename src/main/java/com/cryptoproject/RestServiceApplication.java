package com.cryptoproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coinmarketapi.ApiManager;
import com.coinmarketapi.models.ApiResponse;


@SpringBootApplication
public class RestServiceApplication {

  public static void main(String[] args) {
      ApiResponse<Double> response = ApiManager.getBitcoinPrice();

      if (response.getSuccess()) {
          System.out.println("Il prezzo di Bitcoin e' di: " + response.getData() + " euro");
      } else {
          System.out.println("E' andato tutto in vacca");
      }
  }
}
