package org.swtk.commons.dict.wiktionary.generated.b.a.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBAO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("baobab", "{\"term\":\"baobab\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic {{m|ar|أَبُو حِبَاب||father of many seeds}}, from \u0027أَبُو|lang\u003dar\u0027 () + \u0027حَبّ|lang\u003dar\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A tree, \u0027Adansonia digitata\u0027 (and similar species), native to tropical Africa, having a broad swollen trunk and edible gourd-like hanging fruits\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }