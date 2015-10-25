package org.swtk.commons.dict.wiktionary.generated.b.e.w;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBEW000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("bewilderment", "{\"term\":\"bewilderment\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|bewilder|ment|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being bewildered\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A confusing or perplexing situation\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }