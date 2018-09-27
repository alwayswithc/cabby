/**
 * This file created at 2016年6月28日.
 *
 * Copyright (c) 2002-2016 Bingosoft, Inc. All rights reserved.
 */
package cabby.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * 获得配置文件的内容
 * @author Administrator
 *
 */
public class PropertiesUtil {
    private  Properties props = new Properties();

    public  String getValue(String key) {
        return props.getProperty(key);
    }
    
    /**
	 * 
	 */
	public PropertiesUtil(String file){
    	ClassLoader loder=PropertiesUtil.class.getClassLoader();
        InputStream ips=loder.getResourceAsStream(file);
        try {
            props.load(ips);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
