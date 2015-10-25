package org.swtk.commons.dict.wiktionary.generated.z.a.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryZAR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("zari", "{\"term\":\"zari\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fine gold or silver thread used in traditional Indian, Pakistani and Persian garments, especially as brocade in saris etc\", \"priority\":1}]}, \"synonyms\":{}}");

	add("zarnec", "{\"term\":\"zarnec\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Persian\", \"pahlavi\"], \"text\":\"Ultimately from Pahlavi \u0027𐭦𐭥𐭭𐭩𐭪|tr\u003dzarnik\u0027 (gold-colored) compare Persian \u0027زرنیخ|tr\u003dzarnix\u0027 (orpiment) \u0027زرنی\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A native sulfide of arsenic, including sandarac and orpiment\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }