package org.generic;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

import io.opentelemetry.sdk.metrics.data.Data;

public class JavaUtility {

	public int getRandomNumber(int limit) {
		return new Random().nextInt(limit);
		
	}
	public Object convertToDataType(String dataType, DataType statrgey) {
		Object obj=null;
		
		if (statrgey.toString().equalsIgnoreCase("long"))
			obj=Long.parseLong(dataType);
		else if(statrgey.toString().equalsIgnoreCase("int"))
			obj=Integer.parseInt(dataType);
		else if(statrgey.toString().equalsIgnoreCase("double"))
			obj=Double.parseDouble(dataType);
		return obj;
		
	}
	public static long covertAnyDataType(String timeouts, DataType l) {
		
		return 0;
	}
	public String currentTime() {
		Date date=new Date(0);
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yyyy_hh_mm_sss");
		String actualDate=sdf.format(date);
		return actualDate;
	}
	      

	}


 