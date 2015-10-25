package org.swtk.commons.dict.wiktionary.generated.f.u.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFUG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("fugu", "{\"term\":\"fugu\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"From Japanese \u0027フグ|tr\u003dfugu\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Blowfish: a delicacy popular in Japan served raw as sushi that may, if improperly prepared, contain deadly levels of neurotoxins\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }