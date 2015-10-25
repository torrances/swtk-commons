package org.swtk.commons.dict.wiktionary.generated.a.d.w;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryADW000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("adware", "{\"term\":\"adware\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|ad|ware|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A software application that includes advertisements, which are displayed while the software is running. Developers use adware as a source of income and to keep the costs of the software down (usually making it free). Some adware programs can include spyware\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }