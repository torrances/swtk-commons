package org.swtk.commons.dict.wiktionary.generated.b.i.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBIA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("bialgebra", "{\"term\":\"bialgebra\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|bi|algebra|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A particular form of vector space which is a compatible form of two algebras\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }