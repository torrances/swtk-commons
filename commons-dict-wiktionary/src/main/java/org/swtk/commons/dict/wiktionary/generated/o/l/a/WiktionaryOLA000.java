package org.swtk.commons.dict.wiktionary.generated.o.l.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOLA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("olay", "{\"term\":\"olay\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Tamil.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"palm leaves, prepared for being written upon with a steel-tipped stylu\", \"priority\":1}]}, \"synonyms\":{}}");

	add("olaparib", "{\"term\":\"olaparib\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A particular anticancer drug\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }