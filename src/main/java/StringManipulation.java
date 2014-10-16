import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;


public class StringManipulation {
	public static void main(String[] args) {
		Map<String,Long> cookiesTobeRemovedMaxSize = new HashMap<String, Long>();
		try {
			String str = "cookie1-100,cookie2-200,cookie3-300,cookie4-400,cookie5-500,cookie6-600,cookie7-700,cookie8-800,cookie9-900";
			List<String> cookiesList = Arrays.asList(str.split(","));
			Iterator<String> iter = cookiesList.listIterator();
			while(iter.hasNext()){
				String[] t = StringUtils.split(iter.next(),'-');
				cookiesTobeRemovedMaxSize.put(t[0], Long.valueOf(t[1]));
			}
			
			Iterator<String> iter2 = cookiesTobeRemovedMaxSize.keySet().iterator();
			while(iter2.hasNext()){
				String key = iter2.next();
				System.out.println("Key :: "+key + " value:: "+cookiesTobeRemovedMaxSize.get(key));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
