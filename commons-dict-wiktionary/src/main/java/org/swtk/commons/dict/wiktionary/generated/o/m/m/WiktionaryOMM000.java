package org.swtk.commons.dict.wiktionary.generated.o.m.m;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOMM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ommatidium", "{\"term\":\"ommatidium\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From the stem form of Ancient greek (to 1453) \u0027ὄμμα\u0027 (eye) + \u0027-idium\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One of the conical substructures which make up the eyes of invertebrates\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1996\u0027\u0027: the ‘compound’ eyes of insects [...] are made up of large numbers of facets or \u0027\u0027ommatidia\u0027\u0027, and in this sense, our own eyes are ‘simple’. — Michael J. Roberts, \u0027Spiders of Britain and Northern Europe\u0027 (Collins 1996, p. 12\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }