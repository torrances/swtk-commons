package org.swtk.commons.dict.wiktionary.generated.p.e.q;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPEQ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pequot", "{\"term\":\"pequot\", \"etymology\":{\"influencers\":[], \"languages\":[\"western abnaki\", \"English\", \"narragansett\"], \"text\":\"Attested in English since the 1620s/1630s, from Narragansett \u0027pequttôog\u0027 (people of the shoals) (compare Western abnaki \u0027pôgwa\u0027 (shallow, shoal) .\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A member of a tribe of Native Americans who historically inhabited eastern Connecticut and spoke a variety of Mohegan-Pequot\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }