package org.swtk.commons.dict.wiktionary.generated.g.e.c;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGEC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("geck", "{\"term\":\"geck\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\", \"middle high german (ca. 1050-1500)\", \"middle low german\", \"Dutch\"], \"text\":\"Either from Middle high german (ca. 1050-1500) \u0027geck\u0027 (German \u0027geck\u0027 , or directly from its source, Middle low german \u0027geck\u0027 \u0027gek\u0027 (idiot, farcical fool) Cognate to Dutch \u0027gek\u0027 (crazy, farcical, silly)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"scorn; derision; contemp\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Fool; idiot; imbecil\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Shakespear\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"To become the \u0027\u0027geck\u0027\u0027 and scorn / O\u0027 the other\u0027s villainy\", \"priority\":4}]}, \"synonyms\":{}}");

	add("gecko", "{\"term\":\"gecko\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Malay\"], \"text\":\"From Malay \u0027gekok\u0027 for the sound they make when moving.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any lizard of the family Gekkonidae. They are small, carnivorous, mostly nocturnal animals with large eyes and adhesive toes enabling them to climb on vertical surfaces\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }