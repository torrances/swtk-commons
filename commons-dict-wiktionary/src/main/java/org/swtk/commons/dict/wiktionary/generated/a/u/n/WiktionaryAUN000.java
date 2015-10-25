package org.swtk.commons.dict.wiktionary.generated.a.u.n;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAUN000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("auntdom", "{\"term\":\"auntdom\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|aunt|dom|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the state of being an aun\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1933\u0027\u0027, \u0027Punch\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Nothing has ever been written about the sacredness of \u0027\u0027aunthood\u0027\u0027. No one has painted a tender study of an aunt amusing the children on a wet afternoon\", \"priority\":3}]}, \"synonyms\":{}}");

	add("aunthood", "{\"term\":\"aunthood\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality or state of being an aunt\", \"priority\":1}]}, \"synonyms\":{}}");

	add("auntness", "{\"term\":\"auntness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|aunt|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the state of being an aunt\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }