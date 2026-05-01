package com.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiController {
    
    @Autowired
    private NotificationServiceFieldInjection fieldInjectionService;
    
    @Autowired
    private NotificationServiceConstructorInjection constructorInjectionService;
    
    @Autowired
    private NotificationServiceSetterInjection setterInjectionService;
    
    @GetMapping("/test-field/{msg}")
    public String testFieldInjection(@PathVariable String msg) {
        fieldInjectionService.sendEmail(msg);
        return "Field injection test completed. Check console for output.";
    }
    
    @GetMapping("/test-constructor/{msg}")
    public String testConstructorInjection(@PathVariable String msg) {
        constructorInjectionService.sendEmail(msg);
        return "Constructor injection test completed. Check console for output.";
    }
    
    @GetMapping("/test-setter/{msg}")
    public String testSetterInjection(@PathVariable String msg) {
        setterInjectionService.sendEmail(msg);
        return "Setter injection test completed. Check console for output.";
    }
    
    @GetMapping("/test-all/{msg}")
    public String testAllInjections(@PathVariable String msg) {
        fieldInjectionService.sendEmail(msg);
        constructorInjectionService.sendEmail(msg);
        setterInjectionService.sendEmail(msg);
        return "All injection types tested. Check console for output.";
    }
}
