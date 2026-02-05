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
            <title>My Docker Project</title>
            <style>
                body {
                    font-family: Arial;
                    background-color: #eef2f7;
                    text-align: center;
                    padding: 50px;
                }

                .box {
                    background: white;
                    padding: 30px;
                    border-radius: 10px;
                    max-width: 600px;
                    margin: auto;
                    box-shadow: 0 0 10px gray;
                }

                h1 {
                    color: #2c3e50;
                }

                .footer {
                    margin-top: 20px;
                    color: gray;
                }
            </style>
        </head>

        <body>
            <div class="box">
                <h1>Docker + Spring Boot Project</h1>

                <p>
                    This project is created by <b>Hrishikesh Khandagale</b>
                </p>

                <p>
                    Technologies Used:
                </p>

                <p>
                    ✔ Spring Boot Application <br>
                    ✔ Docker Containerization <br>
                    ✔ GitHub Actions CI/CD
                </p>

                <div class="footer">
                    Project Successfully Running in Docker Container
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
