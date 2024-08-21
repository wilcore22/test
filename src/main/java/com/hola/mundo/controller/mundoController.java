package com.hola.mundo.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mundo")
public class mundoController {

    @GetMapping("/getHola")
    public String holaMundo() {

        String hola = "Hola Mundo";
       System.out.println("Hola mundo");



        return hola;
    }

}
