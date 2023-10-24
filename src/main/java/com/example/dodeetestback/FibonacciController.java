package com.example.dodeetestback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FibonacciController {

    @GetMapping("/fibonacci")
    public FibonacciResponse calculateFibonacci(
            @RequestParam(name = "member-count") int memberCount
    ) {
        if (memberCount < 1 || memberCount > 100) {
            throw new IllegalArgumentException("Invalid member count. It should be between 1 and 100.");
        }

        List<Integer> sequence = new ArrayList<>();
        int a = 0, b = 1;
        int total = 0;

        for (int i = 0; i < memberCount; i++) {
            sequence.add(a);
            total += a;
            int temp = a;
            a = b;
            b = temp + b;
        }

        return new FibonacciResponse(memberCount,sequence, total); // รวมคุณสมบัติ memberCount
    }
}
