package org.swtk.commons.dict.wiktionary.generated.l.e.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLER000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("leroy", "{\"term\":\"leroy\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"Transferred from the common French surname \u0027leroy\u0027 since the nineteenth century, for no apparent reason except its transparent meaning, \u0027le roi\u0027 \u0026quot;the king\u0026quot;.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A CDP in Alabam\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A town in Saskatchewa\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A city in Texas\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }