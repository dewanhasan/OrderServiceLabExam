package ie.atu.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class OrderController {
    private final OrderService orderService;
    @Autowired
    public void injectedConstructor(OrderService orderService) {
        this.OrderService = orderService;
    }

    @PostMapping("/Add")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Map<String, String, String, String> handleorderRequests(@RequestBody OrderInfo orderInfo){
        Map<String, String, String, STring> customerMessage = HashMap.newHashMap()
    }
}
