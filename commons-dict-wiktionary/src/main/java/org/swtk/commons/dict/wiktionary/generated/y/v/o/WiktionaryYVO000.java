package org.swtk.commons.dict.wiktionary.generated.y.v.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYVO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yvonne", "{\"term\":\"yvonne\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"Proto-Germanic\"], \"text\":\"French feminine form of Yvon, variant of Yves, from Proto-germanic root \u0027iv\u0027 (\u0027yew\u0027). It might refer to an archer, since yew wood was used to make bows.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"borrowed from France, in regular use since the twentieth century\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1896\u0027\u0027 Ernest Christopher Dowson: \u0027Yvonne of Brittany\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"In your mother\u0027s apple orchar\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"When the world was left behind\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"You were shy, so shy, \u0027\u0027Yvonne\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"But your eyes were calm and kind\", \"priority\":6}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }