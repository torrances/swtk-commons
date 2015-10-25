package org.swtk.commons.dict.wiktionary.generated.z.a.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryZAL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("zalcitabine", "{\"term\":\"zalcitabine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027zal-\u0027 of {{unk.|lang\u003den}} origin, + \u0027citabine\u0027 variation of \u0027cytidine\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The compound 2\u0027-3\u0027-dideoxycytidine, a nucleoside analog reverse transcriptase inhibitor, formerly used in antiretroviral therap\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }