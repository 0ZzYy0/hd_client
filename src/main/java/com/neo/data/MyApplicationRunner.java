package com.neo.data;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Order(value = 1)
public class MyApplicationRunner implements ApplicationRunner {
    @Autowired  
    private RestTemplate restTemplate;  
    
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		// TODO Auto-generated method stub
/*		 System.out.println("开始模拟读取haiwell数据!");
		 ParTempEntity par = new ParTempEntity();
		 par.setDeviceId(Long.parseLong("1"));
		 par.setTempDate(new Date());
		 par.setTempName("温度2");
		 par.setTempValue("20度");
		 ResponseEntity<R> responseEntity = this.restTemplate.postForEntity("http://r18671e836.51mypc.cn:39312/partemp/save", par ,R.class);
		 if(responseEntity.getStatusCodeValue() == 200){			 
			 System.out.println("接口调用成功！");
		 }*/
	}

}
