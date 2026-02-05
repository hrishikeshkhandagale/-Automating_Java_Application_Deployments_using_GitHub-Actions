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
            <title>My Docker App</title>
            <style>
                body {
                    font-family: Arial;
                    background-color: #f4f4f4;
                    text-align: center;
                    padding-top: 60px;
                }

                .card {
                    background: white;
                    padding: 25px;
                    width: 500px;
                    margin: auto;
                    border-radius: 10px;
                    box-shadow: 0 0 10px #aaa;
                }

                h2 {
                    color: #2c3e50;
                }

                p {
                    font-size: 18px;
                }

                .footer {
                    margin-top: 15px;
                    color: gray;
                    font-size: 14px;
                }
            </style>
        </head>

        <body>
            <div class="card">
                <h2>Spring Boot + Docker Project</h2>

                <p>
                    Created By: <b>Hrishikesh Khandagale</b>
                </p>

                <p>
                    This is a simple Java application  
                    running inside Docker container.
                </p>

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
