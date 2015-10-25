package org.swtk.commons.dict.wiktionary.generated.g.w.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGWA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gwas", "{\"term\":\"gwas\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Acronym of \u0027\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An analysis of allelic association for genes or genetic markers throughout a genome\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }