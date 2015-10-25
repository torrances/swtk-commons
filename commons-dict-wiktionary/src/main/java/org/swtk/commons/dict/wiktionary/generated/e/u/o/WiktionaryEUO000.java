package org.swtk.commons.dict.wiktionary.generated.e.u.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEUO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("euonym", "{\"term\":\"euonym\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|eu|onym|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A name well suited to a person, place or thing so named\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }