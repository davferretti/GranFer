package com.esame.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;

/*
 * classe che gestisce l'input da POST che servirà per
 * cambiare la città nel file config
 */
@Controller
public class InputNomeCitta {

	@PostMapping("/meteo/config")

    public String scriviConfig(@RequestBody String conf) throws IOException{

           String config = conf;
           fileConfig.setConfig(config);

           
       return " ";
      
}
}

	