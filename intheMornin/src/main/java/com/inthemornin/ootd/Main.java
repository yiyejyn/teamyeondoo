package com.inthemornin.ootd;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.inthemornin.ootd.model.CustomerVO;
import com.inthemornin.ootd.service.IClothService;
import com.inthemornin.ootd.service.ICustomerService;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =
				new GenericXmlApplicationContext("spring/application-config.xml");
		IClothService clothService = 
				context.getBean("clothService", IClothService.class);
			
			System.out.println("-- 사원의 수 조회");
			System.out.println(clothService.getCount());
			System.out.println(clothService.getCount(10));
			

			
			
			
		context.close();
	}

}
