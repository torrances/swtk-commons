package org.swtk.commons.dict.wiktionary.generated.r.k.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryRKA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("rkatsiteli", "{\"term\":\"rkatsiteli\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|ka|რქაწითელი|lit\u003dred stem|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A kind of grape used to produce white wine\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }