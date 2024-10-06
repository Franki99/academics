package rw.auca.academics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String showLandingPage() {
        return "landing";  // This will load landing.html
    }

    @GetMapping("/signin")
    public String showSignInPage() {
        return "signin";  // This will load signin.html
    }

    @GetMapping("/signup")
    public String showSignUpPage() {
        return "signup";  // This will load signup.html
    }

    @GetMapping("/home")
    public String showHomePage() {
        return "home";  // This will load home.html
    }
}
