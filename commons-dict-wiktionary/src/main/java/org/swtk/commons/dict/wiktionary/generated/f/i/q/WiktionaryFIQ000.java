package org.swtk.commons.dict.wiktionary.generated.f.i.q;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFIQ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("fiqh", "{\"term\":\"fiqh\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic \u0027فِقْه|lang\u003dar\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Jurisprudence in the Islamic law, shari\u0027a\", \"priority\":1}]}, \"synonyms\":{}}");

	add("fique", "{\"term\":\"fique\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The natural fiber which occurs in the leaves of the fique plant\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Fique\u0027\u0027 is often confused with agave.\u0027Category:en:Asparagus family plants\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }