package br.com.rns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class StartAppPage {

    @GetMapping("init")
    @ResponseBody
    public String startPage() {
        return "<h1>Welcome to Accounting Tax</h1>";
    }
}
