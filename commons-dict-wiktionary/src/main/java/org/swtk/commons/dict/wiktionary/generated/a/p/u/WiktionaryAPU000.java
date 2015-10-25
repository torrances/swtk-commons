package org.swtk.commons.dict.wiktionary.generated.a.p.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAPU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("apudoma", "{\"term\":\"apudoma\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|APUD cell|oma|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An endocrine tumor arising from an APUD cell\", \"priority\":1}]}, \"synonyms\":{}}");

	add("apuleius", "{\"term\":\"apuleius\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An author in the Roman Empire\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }