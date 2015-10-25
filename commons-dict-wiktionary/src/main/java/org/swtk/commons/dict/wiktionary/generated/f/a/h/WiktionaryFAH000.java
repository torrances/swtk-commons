package org.swtk.commons.dict.wiktionary.generated.f.a.h;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFAH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("fahrvergnügen", "{\"term\":\"fahrvergnügen\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|de|Fahrvergnügen|lang\u003den}}, from {{compound|fahren|Vergnügen|t1\u003dto drive|t2\u003dpleasure|nocat\u003d1|lang\u003den}}; popularised by Volkswagen advertisements in the 1990s.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"‘Driving pleasure’, especially with regard to Volkswagen vehicles\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }