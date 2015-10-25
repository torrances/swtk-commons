package org.swtk.commons.dict.wiktionary.generated.g.u.f;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGUF000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("guff", "{\"term\":\"guff\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Nonsensical talk or thinking\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"If she had her way, she’d ruin the company inside a year with her hare-brained schemes ; love of the people, and that sort of \u0027\u0027guff\u0027\u0027.”\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Superfluous information\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Insolent or otherwise unacceptable remarks\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }