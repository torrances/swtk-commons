package org.swtk.commons.dict.wiktionary.generated.j.o.c;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJOC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("joculatrix", "{\"term\":\"joculatrix\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"Latin {{suffix|joculator|trix|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A female joculator; a female jester, comedian or entertainer\", \"priority\":1}]}, \"synonyms\":{}}");

	add("jocundness", "{\"term\":\"jocundness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|jocund|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being jocund\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }