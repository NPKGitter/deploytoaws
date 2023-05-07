package com.helloworld.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hello() 
{
return "<h1> Congratulations. <br>You have successfully deployed the sample Spring Boot Application. <br>Update 1 on May 7, 2023</h1>";
}
}
