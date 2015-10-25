package org.swtk.commons.dict.wiktionary.generated.a.r.v;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryARV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("arverni", "{\"term\":\"arverni\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A member of an ancient, powerful Gallic tribe living in what is now the Auvergne region of France, who opposed the Romans on several occasions\", \"priority\":1}]}, \"synonyms\":{}}");

	add("arviculture", "{\"term\":\"arviculture\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"arable farming\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }