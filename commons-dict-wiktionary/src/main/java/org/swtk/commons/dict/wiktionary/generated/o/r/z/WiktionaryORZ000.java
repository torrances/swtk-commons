package org.swtk.commons.dict.wiktionary.generated.o.r.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryORZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("orzo", "{\"term\":\"orzo\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Italian\"], \"text\":\"From Italian \u0027orzo\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A form of pasta the size and shape of grains of rice or barley; often used in soups\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }