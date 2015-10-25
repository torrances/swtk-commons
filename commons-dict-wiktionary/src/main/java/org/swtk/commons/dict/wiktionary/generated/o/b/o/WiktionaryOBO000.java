package org.swtk.commons.dict.wiktionary.generated.o.b.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOBO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("obomber", "{\"term\":\"obomber\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"* {{blend|Obama|bomber|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"an epithet of Barack Obama\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }