package org.swtk.commons.dict.wiktionary.generated.x.n.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryXNO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("xnor", "{\"term\":\"xnor\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|exclusive|NOR|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A logic gate which is the inverse of XOR\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }