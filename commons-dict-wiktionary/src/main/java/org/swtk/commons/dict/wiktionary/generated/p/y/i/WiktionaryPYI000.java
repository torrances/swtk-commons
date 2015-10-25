package org.swtk.commons.dict.wiktionary.generated.p.y.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPYI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pyin", "{\"term\":\"pyin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|pyo-|-in|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An albuminoid constituent of pus, related to mucin, possibly a mixture of substances rather than a single body\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }