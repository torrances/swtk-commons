package org.swtk.commons.dict.wiktionary.generated.y.u.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYUK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yukhoe", "{\"term\":\"yukhoe\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Korean\"], \"text\":\"From Korean {{l|ko|육회|tr\u003dyukhoe}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Image:1001 thumb|yukho\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"One of a variety of hoe (raw dishes in Korean cuisine), which are usually made from raw ground beef seasoned with various spices or sauces\", \"priority\":2}]}, \"synonyms\":{}}");

	add("yukigassen", "{\"term\":\"yukigassen\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"Japanese literally \u0026quot;snow battle\u0026quot;.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Japanese game, played on a court by two teams of seven players, in which players are eliminated when hit with snowballs\", \"priority\":1}]}, \"synonyms\":{}}");

	add("yukon", "{\"term\":\"yukon\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"gwichʼin\"], \"text\":\"Gwichʼin \u0027yukon\u0027 (great river)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Yukon Territor\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A city/town in Oklahoma\", \"priority\":2}]}, \"synonyms\":{}}");

	add("yukoner", "{\"term\":\"yukoner\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Yukon|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A native or inhabitant of the Yukon Territory, Canada\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }