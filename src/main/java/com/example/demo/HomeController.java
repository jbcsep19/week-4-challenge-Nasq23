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

    @RequestMapping("/ObjectOrientedJava")
    public String objectorientedjava(){
        return "ObjectOrientedJava";
    }

    @RequestMapping("/ProjectDesignAndAlgorithms")
    public String projectdesignandalgorithms(){
        return "ProjectDesignAndAgorithms";
    }

    @RequestMapping("/HtmlCssBootstrap")
    public String htmlcssbootstrap(){
        return "HtmlCssBootstrap";
    }

    @RequestMapping("/CoreJava")
    public String corejava(){
        return "Blog";
    }

    @RequestMapping("/Github")
    public String github(){
        return "Github";
    }





}