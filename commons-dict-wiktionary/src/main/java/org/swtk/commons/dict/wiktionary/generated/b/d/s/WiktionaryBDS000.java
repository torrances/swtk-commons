package org.swtk.commons.dict.wiktionary.generated.b.d.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBDS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("bdsm", "{\"term\":\"bdsm\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Contracted abbreviation of bondage/discipline, dominance/submission, sadism/masochism.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"initialism, uncountable)\u0027 Sexual practices or activities involving bondage, discipline, sadism, masochism, or acts of domination and submission\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }