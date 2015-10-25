package org.swtk.commons.dict.wiktionary.generated.x.n.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryXNA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("xnand", "{\"term\":\"xnand\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|exclusive|NAND|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"XOR, a logic gate\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }