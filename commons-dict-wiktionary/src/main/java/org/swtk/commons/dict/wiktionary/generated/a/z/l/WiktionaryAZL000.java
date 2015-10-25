package org.swtk.commons.dict.wiktionary.generated.a.z.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAZL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("azlon", "{\"term\":\"azlon\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From a trade name.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A textile made from regenerated protein fiber\", \"priority\":1}]}, \"synonyms\":{}}");

	add("azlocillin", "{\"term\":\"azlocillin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An acylampicillin antibiotic with an extended spectrum of activity and greater in vitro potency than the carboxy penicillins\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }