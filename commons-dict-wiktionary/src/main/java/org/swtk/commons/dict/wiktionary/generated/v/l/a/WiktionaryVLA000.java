package org.swtk.commons.dict.wiktionary.generated.v.l.a;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVLA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("vlach", "{\"term\":\"vlach\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"From Proto-slavic {{m|sla-pro|*volxъ}}, from Proto-germanic {{m|gem-pro|*walhaz}}. Presumably introduced into Slavic around the 7th century, but first recorded only in the 11th century in Byzantine Greek. In English used as a synonym of \u0026quot;Wallachian\u0026quot; from the 19th century.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"thumb|right|Vlach populations in modern Europe\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A Wallachian\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A Romanian\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Any member of an Eastern Romance speaking group\", \"priority\":4}]}, \"synonyms\":{}}");

	add("vladimir", "{\"term\":\"vladimir\", \"etymology\":{\"influencers\":[], \"languages\":[\"Old Church Slavonic\", \"English\", \"old russian\", \"Russian\"], \"text\":\"From Russian \u0027влади́мир\u0027 a saint\u0027s name in the Russian Orthodox Church, from Old russian \u0027володимѣръ\u0027 Old church slavonic \u0027владимѣръ\u0027 from \u0027владь\u0027 (power) (which is from Proto-indo-european {{m|ine-pro|*wal||be strong}}) + \u0027мѣръ\u0027 (great) changed by folk etymology into \u0027миръ\u0027 (peace)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"popular throughout the history of Slavic countries and societies, but rare as a name of English-speaking persons\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A city in Russia, administrative centre of Vladimir oblast\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }