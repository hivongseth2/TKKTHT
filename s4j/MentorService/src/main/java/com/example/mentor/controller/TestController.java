package com.example.mentor.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import com.example.mentor.entity.Mentor;
import com.example.mentor.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

//@Controller
//@RequestMapping("/seco")
@RestController
@RequestMapping("/mentor")
public class TestController {

//    @Autowired
//    GreetingClient greetingClient;


//    @GetMapping("/test")
//    public ResponseEntity<String> getTestResponse(){
//        return greetingClient.test();
//    }

//    @GetMapping("/abc")
//    public ResponseEntity<String> getABC() {
//        return ResponseEntity.ok("This is ABC");
//    }



    @Autowired
    MentorService mentorService;
    @GetMapping("/list")
    public List<Mentor> getList(){
        return mentorService.getAllProduct();
    }


    @GetMapping("/findById")
    public Mentor findById(@RequestParam Long id) {
        Optional<Mentor> mentorOptional = mentorService.getMentor(id);
        return mentorOptional.isPresent() ? mentorOptional.get() : null;
    }


}
