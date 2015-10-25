package org.swtk.commons.dict.wiktionary.generated.g.o.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGOK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gokkun", "{\"term\":\"gokkun\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"From Japanese \u0027ゴックン\u0027 (tr\u003dgokkun)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A genre of pornography in which a person consumes the semen of multiple men, usually from some vessel or container such as a cup or beaker\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }