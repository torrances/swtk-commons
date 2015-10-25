package org.swtk.commons.dict.wiktionary.generated.t.e.i;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTEI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("teide", "{\"term\":\"teide\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A dormant volcano on Tenerife; the highest mountain in Spain\", \"priority\":1}]}, \"synonyms\":{}}");

	add("teinds", "{\"term\":\"teinds\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"In Scotland, tithes derived from the produce of the land for the maintenance of the clergy\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }