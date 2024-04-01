package com.example.invoice.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {

    @GetMapping("/invoice")
    public String invoice() {
        return "invoice";
    }

}
