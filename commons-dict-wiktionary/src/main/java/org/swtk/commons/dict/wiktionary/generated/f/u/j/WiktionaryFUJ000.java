package org.swtk.commons.dict.wiktionary.generated.f.u.j;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFUJ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("fuji", "{\"term\":\"fuji\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"plain spun silk fabri\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A Nigerian musical genreCategory:en:FabricsCategory:en:Music genres\", \"priority\":2}]}, \"synonyms\":{}}");

	add("fujoshi", "{\"term\":\"fujoshi\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"From Japanese \u0027腐女子|lang\u003dja\u0027 () literally \u0026quot;rotten girl\u0026quot;.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A female fan of manga and novels that feature romantic relationships between men\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }