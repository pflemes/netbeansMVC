/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.netbeansMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Adivar
 */
@Controller
public class NetbeansMvcController {
    
    @RequestMapping("/olaMundo")
    public String netbeansMvc() {
        
        return "index";
        
    }
    
}
