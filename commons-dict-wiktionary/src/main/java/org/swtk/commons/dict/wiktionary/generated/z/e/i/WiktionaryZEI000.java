package org.swtk.commons.dict.wiktionary.generated.z.e.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryZEI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("zein", "{\"term\":\"zein\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"\u0027zea\u0027 (corn genus) {{suffix||in|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A protein derived from corn / maize, having many industrial applications\", \"priority\":1}]}, \"synonyms\":{}}");

	add("zeitgeist", "{\"term\":\"zeitgeist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|de|Zeitgeist|t\u003dtime-spirit|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The spirit of the age; the taste, outlook, and spirit characteristic of a perio\", \"priority\":1}]}, \"synonyms\":{}}");

	add("zeitnot", "{\"term\":\"zeitnot\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\"], \"text\":\"From German {{m|de|Zeitnot|lit\u003dneed of time}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"time trouble, time pressure, a situation where a player has little time to complete the required move\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }