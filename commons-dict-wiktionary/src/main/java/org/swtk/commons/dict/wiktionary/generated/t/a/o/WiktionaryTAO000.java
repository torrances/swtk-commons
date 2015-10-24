package org.swtk.commons.dict.wiktionary.generated.t.a.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTAO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("taoiseach", "{\"term\":\"taoiseach\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Irish\", \"primitive irish\", \"old irish (to 900)\"], \"text\":\"From Irish \u0027taoiseach\u0027 from Old irish (to 900) \u0027toísech\u0027 from Primitive irish \u0027ᚈᚑᚃᚔᚄᚐᚉᚓ\u0027 lang\u003dpgl}} {{qualifier|genitive}}, from Proto-celtic {{m|cel-pro|*towissākos}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Head of the Irish government, comparable to a UK or Australian Prime Minister\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }