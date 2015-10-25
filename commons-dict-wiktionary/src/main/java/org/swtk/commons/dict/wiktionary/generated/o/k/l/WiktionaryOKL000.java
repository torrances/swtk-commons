package org.swtk.commons.dict.wiktionary.generated.o.k.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOKL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("oklahoma", "{\"term\":\"oklahoma\", \"etymology\":{\"influencers\":[], \"languages\":[\"choctaw\", \"English\"], \"text\":\"From Choctaw \u0027okla\u0027 (people), + \u0027homa\u0027 (red).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A state of the United States of America. Capital and largest city: Oklahoma City\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A county in the State of Oklahoma\", \"priority\":2}]}, \"synonyms\":{}}");

	add("oklahoman", "{\"term\":\"oklahoman\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Oklahoma|an|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A resident of the U.S. state of Oklahoma\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }