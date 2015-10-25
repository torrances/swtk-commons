package org.swtk.commons.dict.wiktionary.generated.a.g.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAGL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("agliophobia", "{\"term\":\"agliophobia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fear of emotional and physical pain\", \"priority\":1}]}, \"synonyms\":{}}");

	add("aglycosuria", "{\"term\":\"aglycosuria\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|a|glycosuria|lang\u003den}}?\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Absence of sugar in the blood\", \"priority\":1}]}, \"synonyms\":{}}");

	add("aglyph", "{\"term\":\"aglyph\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|a|glyph|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any aglyphous snake\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }