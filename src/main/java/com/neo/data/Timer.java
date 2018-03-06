/*package com.neo.data;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableScheduling
@Component
@Order(value = 1)
public class Timer {
	@Autowired
	private RestTemplate restTemplate;

	@Scheduled(cron = "0/10 * * * * *")
	public void timer() {
		System.out.println("开始模拟读取haiwell数据!");
		Random rand = new Random();

		ParTempEntity par = new ParTempEntity();
		par.setDeviceId(Long.parseLong("1"));
		par.setTempDate(new Date());
		par.setTempName("温度");
		par.setTempValue(rand.nextInt(30) + "度");
		ResponseEntity<R> responseEntity = this.restTemplate.postForEntity(
				"http://r18671e836.51mypc.cn:39312/partemp/save", par, R.class);
		if (responseEntity.getStatusCodeValue() == 200) {
			System.out.println("接口调用成功！");
		}
	}
}
*/