package org.swtk.commons.dict.wiktionary.generated.a.e.q;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAEQ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("aequorin", "{\"term\":\"aequorin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Aequorea|in|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A photoprotein, isolated from luminescent jellyfish and other marine organisms, composed of two distinct units: the apoprotein apoaequorin and the prosthetic group coelenterazine\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }