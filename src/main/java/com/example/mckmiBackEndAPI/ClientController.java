package com.example.mckmiBackEndAPI;

import org.springframework.web.bind.annotation.*;


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

    @PostMapping("/client")
    public void addClient(@RequestBody Client client){

        ClientResponse.insertClient(client.getClientName());
    }

}




