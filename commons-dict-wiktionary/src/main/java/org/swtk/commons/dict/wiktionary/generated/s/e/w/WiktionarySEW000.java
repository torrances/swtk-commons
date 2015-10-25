package org.swtk.commons.dict.wiktionary.generated.s.e.w;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySEW000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("sewerage", "{\"term\":\"sewerage\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|sewer|age|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A sewer system\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sewering", "{\"term\":\"sewering\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of constructing or replacing a sewer system for a new development or neighborhood\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sewerman", "{\"term\":\"sewerman\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|sewer|man|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A man who works in a sewer\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }