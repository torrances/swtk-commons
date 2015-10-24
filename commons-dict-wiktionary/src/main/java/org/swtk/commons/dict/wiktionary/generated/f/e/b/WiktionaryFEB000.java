package org.swtk.commons.dict.wiktionary.generated.f.e.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFEB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("februation", "{\"term\":\"februation\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027februatio\u0027, from \u0027februare\u0027 ‘purify’.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"purification, rejuvenation, renewal, especially ritual or ceremonia\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Romantics hoped the war would bring a \u0027\u0027februation\u0027\u0027 by fire\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"the object of such purification; a sacrifice\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }