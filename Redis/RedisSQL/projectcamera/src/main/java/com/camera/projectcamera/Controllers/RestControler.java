//package com.camera.projectcamera.Controllers;
//
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/rest")
//@RequiredArgsConstructor
//
//public class RestControler {
//    @Autowired
//    private RestTemplate restTemplate;
//    @Autowired
//    private OrderService orderService;
//
//
//    @GetMapping("/user")
//    public Object getForObjectUser() {
//        String apiUrl = "http://localhost:8081/user";
//        return restTemplate.getForObject(apiUrl, Object.class);
//    }
//
//    @GetMapping("/product")
//    public Object getForObjectProduct() {
//        String apiUrl = "http://localhost:8082/product";
//        return restTemplate.getForObject(apiUrl, Object.class);
//    }
//    @GetMapping("/productUser")
//    public Map<String, Object> getForObjectOrder() {
//        String apiUrlUser = "http://localhost:8081/user/get?userId=1";
//        Map<String, Object> user = restTemplate.getForObject(apiUrlUser, Map.class);
//
//        String apiUrlProduct = "http://localhost:8082/product/get?productId=1";
//        Map<String, Object> product = restTemplate.getForObject(apiUrlProduct, Map.class);
//
//        Order order = orderService.getOrderById(1L);
//
//        Map<String, Object> result = new HashMap<>();
//        result.put("user", user);
//        result.put("product", product);
//        result.put("order", order);
//
//        return result;
//    }
//
//}
