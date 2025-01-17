package com.example.demodeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoDeployApplicationTests {

    @Test
    void contextLoads() {
        // 단위 테스트 (하는 자리)
        // MVC 테스트 -> 목업통해서 가상 처리 가능
        // RestAPI 테스트 가능
        System.out.println("단위 테스트 호출!! echo");
    }

}
