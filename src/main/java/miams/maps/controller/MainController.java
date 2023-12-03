package miams.maps.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class MainController {
    @GetMapping
    public ResponseEntity<String> Hello(){
        return ResponseEntity.ok("Hello from secured endpoint");
    }

}
