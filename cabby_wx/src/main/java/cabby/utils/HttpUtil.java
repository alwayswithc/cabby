/**
 * This file created at 2016年6月27日.
 *
 * Copyright (c) 2002-2016 Bingosoft, Inc. All rights reserved.
 */
package cabby.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

/**
 * <code>{@link HttpUtil}</code>
 *
 * TODO : document me
 *
 * @author Cabby
 */
public class HttpUtil {
	/**
	 * post方法提交请求。
	 * 
	 * @return
	 */
	public static String doPost(String url,Map<String,String> map) {
		String uriAPI = url;// Post方式没有参数在这里
		String result = "";
		HttpPost httpRequst = new HttpPost(uriAPI);// 创建HttpPost对象
		List params = new ArrayList();
		
		Set<Entry<String, String>> entrys=map.entrySet();
		Iterator<Entry<String, String>> it=entrys.iterator();
		while(it.hasNext()){
			Entry<String, String> e=it.next();
			params.add(new BasicNameValuePair(e.getKey(),e.getValue()));
		}
		
		try {
			httpRequst.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
			HttpResponse httpResponse = new DefaultHttpClient()
					.execute(httpRequst);
			if (httpResponse.getStatusLine().getStatusCode() == 200) {
				HttpEntity httpEntity = httpResponse.getEntity();
				result = EntityUtils.toString(httpEntity);// 取出应答字符串
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage().toString();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage().toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage().toString();
		}
		return result;
	}

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("action", "cuLogin");
		System.out.println(doPost("http://testuser.tianma315.com/app/customer.ashx",map));
	}
	
}

