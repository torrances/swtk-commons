package org.swtk.commons.dict.wiktionary.generated.d.s.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDSL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dsld", "{\"term\":\"dsld\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"an equine skeletal disorder characterized by a hyperabundance of a certain proteoglycan in equine connective tissue which causes degeneration and eventually death. Present in many or all breeds\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }