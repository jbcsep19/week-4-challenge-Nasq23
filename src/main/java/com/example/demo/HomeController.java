package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController{

    @RequestMapping("/")
    public String first(){
        return "Home";
    }

    @RequestMapping("/Home")
    public String home(){
        return "Home";
    }

    @RequestMapping("/AuthorsBio")
    public String authorsabout(){
        return "AuthorsBio";
    }

    @RequestMapping("/ObjectOrientedJava")
    public String objectorientedjava(){
        return "ObjectOrientedJava";
    }

    @RequestMapping("/ProjectDesignAndAlgorithms")
    public String projectdesignandalgorithms(){
        return "ProjectDesignAndAlgorithms";
    }

    @RequestMapping("/HtmlCssBootstrap")
    public String htmlcssbootstrap(){
        return "HtmlCssBootstrap";
    }

    @RequestMapping("/CoreJava")
    public String corejava(){
        return "CoreJava";
    }

    @RequestMapping("/Github")
    public String github(){
        return "Github";
    }





}