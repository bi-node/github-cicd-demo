package com.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionsDemoApplication {

//    echo "# github-cicd-demo" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/bi-node/github-cicd-demo.git
//    git push -u origin main

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsDemoApplication.class, args);
    }

}
