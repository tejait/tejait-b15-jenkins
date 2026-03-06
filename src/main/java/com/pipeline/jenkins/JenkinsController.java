package com.pipeline.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class JenkinsController {
    @GetMapping("welcome")
    public String welcome(){
        return "Welcome to Jenkins..User Teja";
    }
    //added comment for maven
    @GetMapping("docker")
    public String docker(){
        return "Docker API";
    }
    @GetMapping("hello")
    public  String hello(){
        return "Hello Teja";
    }
    @GetMapping("kubernetes")
    public String kubernetes(){
        return "Kubernetes API";
    }
}
