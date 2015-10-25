package org.swtk.commons.dict.wiktionary.generated.l.h.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLHA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lhasa", "{\"term\":\"lhasa\", \"etymology\":{\"influencers\":[], \"languages\":[\"Tibetan\", \"English\"], \"text\":\"From Tibetan \u0027ལྷ་ས\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Capital of Xizang (Tibet) Autonomous Region of the People\u0027s Republic of People’s Republic of China\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }