package com.example.dodeetestback;

import java.util.List;

public class FibonacciResponse {
    private int memberCount; // ย้ายคุณสมบัติ memberCount ไปด้านบน
    private List<Integer> sequence;
    private int total;

    public FibonacciResponse(int memberCount, List<Integer> sequence, int total) {
        this.memberCount = memberCount;
        this.sequence = sequence;
        this.total = total;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public List<Integer> getSequence() {
        return sequence;
    }

    public int getTotal() {
        return total;
    }
}
