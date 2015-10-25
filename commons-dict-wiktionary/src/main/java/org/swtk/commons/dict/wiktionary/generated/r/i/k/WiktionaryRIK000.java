package org.swtk.commons.dict.wiktionary.generated.r.i.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryRIK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("riksdag", "{\"term\":\"riksdag\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Swedish\"], \"text\":\"From Swedish \u0027riksdag\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The Swedish parliament\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2002\u0027\u0027, \u0027The Great Nation\u0027, Penguin 2003, p. 288\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The bloodless royalist \u0027coup d\u0027état\u0027 performed against his \u0027\u0027Riksdag\u0027\u0027 by enlightened ruler Gustavus III of Sweden in August 1772 gave credence to the idea of a European wave of reaction against the excesses of representative government\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }