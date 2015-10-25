package org.swtk.commons.dict.wiktionary.generated.k.l.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKLA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("klansman", "{\"term\":\"klansman\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Klan|man|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"thumb|right|Klansmen marching in Washington, D\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A man who is a member of the Ku Klux Kla\", \"priority\":2}]}, \"synonyms\":{}}");

	add("klatch", "{\"term\":\"klatch\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|de|Klatsch||meeting at which people gossip|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An informal social gathering, especially one held over coffee for the purpose of conversation\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }