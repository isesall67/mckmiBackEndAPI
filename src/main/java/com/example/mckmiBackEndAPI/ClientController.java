package com.example.mckmiBackEndAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {

    @GetMapping("/client")
    public ClientResponse client(@RequestParam(required = false, value="ClientId") String clientId){


          ClientResponse clientResponse = new ClientResponse();
          if(clientId!=null){
              clientResponse.getClientData(clientId);
          }else{
              clientResponse.getAllClientData();
          }
            return clientResponse;
    }

}



