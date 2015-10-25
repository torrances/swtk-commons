package org.swtk.commons.dict.wiktionary.generated.l.a.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLAZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lazaret", "{\"term\":\"lazaret\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"Italian\"], \"text\":\"From French French|lazaret\u0027, from Italian \u0027lazzaretto\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A lazaretto. \u0026lt;!--which sense, if not the nautical one below?--\u0026gt\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1819\u0027\u0027, Lord Byron, \u0027Don Juan\u0027, II.215\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The liver is the \u0027\u0027lazaret\u0027\u0027 of bile, / But very rarely executes its function\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A lazaretto\", \"priority\":4}]}, \"synonyms\":{}}");

	add("laziness", "{\"term\":\"laziness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|lazy|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being lazy\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }