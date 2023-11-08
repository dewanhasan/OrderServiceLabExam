package ie.atu.orderservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "customer-service-1", url = "http://localhost:8081")
public interface CustomerService {
    @PostMapping("/notify")
    Map<String, String> CustomerService(@RequestBody OrderInfo);
}
