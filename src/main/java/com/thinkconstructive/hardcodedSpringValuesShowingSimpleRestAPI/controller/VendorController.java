package com.thinkconstructive.hardcodedSpringValuesShowingSimpleRestAPI.controller;

import com.thinkconstructive.hardcodedSpringValuesShowingSimpleRestAPI.model.Vendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vendor")
public class VendorController {
    Vendor vendor;
    @GetMapping("{id}")
    public Vendor getVendor(Long id){
        return vendor;
    }

    @PostMapping
    public String createVendor(@RequestBody Vendor vendor){
        this.vendor=vendor;
        return "Vendor created";
    }

    @PutMapping
    public String updateVendor(@RequestBody Vendor vendor){
        this.vendor=vendor;
        return "Vendor updated";
    }

    @DeleteMapping("{id}")
    public String deleteVendor(Long id){
        this.vendor=null;
        return "Vendor deleted";
    }
}
