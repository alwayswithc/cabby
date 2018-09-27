/**
 * This file created at 2016年6月28日.
 *
 * Copyright (c) 2002-2016 Bingosoft, Inc. All rights reserved.
 */
package cabby.utils;

import java.io.IOException;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;

/**
 * <code>{@link JsonUtil}</code>
 * 
 * TODO : document me
 * 
 * @author Administrator
 */
public class JsonUtil {
	/**
	 * Json -> Map
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public static Map jsonToMap(String jsonString) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Map map = mapper.readValue(jsonString, Map.class);
		return map;
	}
	
	  /**   
     * 获取泛型的Collection Type  
     * @param collectionClass 泛型的Collection   
     * @param elementClasses 元素类   
     * @return JavaType Java类型   
     * @since 1.0   
     */   
	public static JavaType getCollectionType(ObjectMapper mapper,Class<?> collectionClass, Class<?>... elementClasses) {   
     return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);   
	}
}
