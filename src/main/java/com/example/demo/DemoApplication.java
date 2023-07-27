package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;


@RestController
@SpringBootApplication
public class DemoApplication {

    int cnt = 1;
    private static final String HOSTNAME = 
        System.getenv().getOrDefault("HOSTNAME", "unknown");

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }
    
    @RequestMapping("/hello")
    String home() {
      Locale locale;
      DateFormat dateFormat; 
      String pattern; 
      SimpleDateFormat simpleDateFormat; 
    
      locale = new Locale("en", "US");
      dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
      // pattern = "dd-M-yyyy hh:mm:ss"; // euro
      pattern = "M-dd-yyyy hh:mm:ss"; // us
      simpleDateFormat = new SimpleDateFormat(pattern);
      String stringNow = simpleDateFormat.format(new Date());

      System.out.println("Aloha: " + cnt);
      return "Aloha Spring " + cnt++ + " " + stringNow + " on " + HOSTNAME;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}