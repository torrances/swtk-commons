package org.swtk.commons.dict.wiktionary.generated.h.u.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHUI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("huitlacoche", "{\"term\":\"huitlacoche\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\", \"classical nahuatl\"], \"text\":\"From Spanish \u0027huitlacoche\u0027 an alteration of \u0027cuitlacoche\u0027 from Classical nahuatl\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"corn Corn smut prepared as a delicac\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }