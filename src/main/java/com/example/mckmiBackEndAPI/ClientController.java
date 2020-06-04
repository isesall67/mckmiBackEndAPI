package com.example.mckmiBackEndAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {

    @GetMapping("/client")
    public Response client(@RequestParam(required = false, value="ClientID") String clientId){


          Response response = new Response();
          if(clientId!=null){
              response.getClientData(clientId);
          }else{
              response.getAllClientData();
          }
            return response;
    }

}



