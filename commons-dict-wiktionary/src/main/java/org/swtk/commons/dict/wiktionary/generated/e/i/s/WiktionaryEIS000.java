package org.swtk.commons.dict.wiktionary.generated.e.i.s;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEIS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("eisel", "{\"term\":\"eisel\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"Ultimately from Latin {{m|la|acētum}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"vinegar, verjuic\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1602\u0027\u0027, w:William William Shakespeare, Hamlet\u0027 , act V scene\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Woul\u0027t drink up \u0027\u0027eisel\u0027\u0027, eat a crocodile\", \"priority\":3}]}, \"synonyms\":{}}");

	add("eisteddfod", "{\"term\":\"eisteddfod\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"Welsh\", \"English\"], \"text\":\"From Welsh \u0027eisteddfod\u0027 (session) from {{compound|eistedd|t1\u003dto sit|bod|t2\u003dto be|lang\u003dcy|nocat\u003d1}} {{qualifier|be sitting}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several annual festivals in which Welsh poets, dancers, and musicians compete for recognition\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }