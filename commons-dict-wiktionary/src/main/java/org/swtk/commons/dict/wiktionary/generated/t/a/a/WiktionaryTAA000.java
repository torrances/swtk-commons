package org.swtk.commons.dict.wiktionary.generated.t.a.a;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTAA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("taaffeite", "{\"term\":\"taaffeite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Taaffe|ite|lang\u003den}}, after {{w|Edward Charles Richard Taaffe}} (1898-1967), Irish gemmologist.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A rare mauve gemstone with a hexagonal crystal structure\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }