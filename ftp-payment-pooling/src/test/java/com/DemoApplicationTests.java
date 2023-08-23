package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.reactiveprogramming.payment.pooling.FtpPaymentPooling;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FtpPaymentPooling.class)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
