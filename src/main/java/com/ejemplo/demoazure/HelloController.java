/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.demoazure;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL
 */
@RestController
public class HelloController {

   @GetMapping("group1")
   @ResponseBody
   @PreAuthorize("hasRole('ROLE_group1')")
   public String group1() {
      return "Hello Group 1 Users!";
   }

   @GetMapping("group2")
   @ResponseBody
   @PreAuthorize("hasRole('ROLE_group2')")
   public String group2() {
      return "Hello Group 2 Users!";
   }
}
