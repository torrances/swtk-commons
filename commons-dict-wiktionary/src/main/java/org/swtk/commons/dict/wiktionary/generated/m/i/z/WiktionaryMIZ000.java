package org.swtk.commons.dict.wiktionary.generated.m.i.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMIZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("mizzenmast", "{\"term\":\"mizzenmast\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The aftmost mast on a ship having three or more mast\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The second mast of a ship having two masts where the second one is shorter, such as a ketch or yawl\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }