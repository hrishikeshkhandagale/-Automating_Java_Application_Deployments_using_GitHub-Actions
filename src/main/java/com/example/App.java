package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @GetMapping("/")
    public String home() {
        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>Spring Boot Docker App</title>

            <style>
                body {
                    font-family: 'Segoe UI', Arial;
                    background: linear-gradient(to right, #1e3c72, #2a5298);
                    text-align: center;
                    padding-top: 80px;
                    color: white;
                }

                .card {
                    background: white;
                    color: black;
                    padding: 30px;
                    width: 520px;
                    margin: auto;
                    border-radius: 15px;
                    box-shadow: 0 10px 25px rgba(0,0,0,0.3);
                }

                h2 {
                    color: #2c3e50;
                }

                .name {
                    color: #2980b9;
                    font-weight: bold;
                }

                .box {
                    background: #f2f2f2;
                    padding: 15px;
                    margin-top: 15px;
                    border-radius: 10px;
                }

                .footer {
                    margin-top: 20px;
                    color: gray;
                    font-size: 14px;
                }

                .tag {
                    display: inline-block;
                    padding: 8px 15px;
                    background: #2a5298;
                    color: white;
                    border-radius: 20px;
                    margin-top: 10px;
                }
            </style>
        </head>

        <body>

            <div class="card">

                <h2>Spring Boot + Docker Project</h2>

                <p>
                    Created By: <span class="name">Hrishikesh Khandagale</span>
                </p>

                <div class="box">
                    This is a simple Java application  
                    running inside Docker container.
                </div>

                <div class="tag">
                    Dockerized Application
                </div>

                <div class="footer">
                    Project Deployed Successfully!
                </div>

            </div>

        </body>
        </html>
        """;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
