package org.swtk.commons.dict.wiktionary.generated.d.u.f;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDUF000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("duff", "{\"term\":\"duff\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An unincorporated community in Indian\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A village in Saskatchewan, Canad\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An unincorporated community in Tennessee\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }