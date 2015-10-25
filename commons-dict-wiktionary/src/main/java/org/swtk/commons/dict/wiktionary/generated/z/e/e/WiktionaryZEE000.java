package org.swtk.commons.dict.wiktionary.generated.z.e.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryZEE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("zeelander", "{\"term\":\"zeelander\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Zeeland|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An inhabitant of Zeeland\", \"priority\":1}]}, \"synonyms\":{}}");

	add("zeerust", "{\"term\":\"zeerust\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Coined by {{w|Douglas Adams}} and w:John Lloyd (producer)|John Lloyd in \u0027{{w|The Meaning of Liff}}\u0027 (1983), from the name of a town in South Africa.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Datedness of something originally intended to seem futuristic\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }