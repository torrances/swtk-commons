package org.swtk.commons.dict.wiktionary.generated.y.a.m;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYAM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yammer", "{\"term\":\"yammer\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"middle dutch (ca. 1050-1350)\", \"English\", \"middle english (1100-1500)\"], \"text\":\"Probably from Middle dutch (ca. 1050-1350) \u0027jammeren\u0027 cognate and reinforced by Middle english (1100-1500) \u0027yeoumeren\u0027 (to mourn, complain) from Old english (ca. 450-1100) \u0027ġeōmrian\u0027 (to lament) from {{m|ang|ġeōmor||sorrowful}}, from Proto-germanic {{m|gem-pro|*jēmaraz||miserable, sorrowful}}, from Proto-indo-european {{m|ine-pro|*yem-||to hold, match, defeat}}. Akin to German \u0027jammern\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act or noise of yammering\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A loud noise\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"One who yammers\", \"priority\":3}]}, \"synonyms\":{}}");

	add("yamoussoukro", "{\"term\":\"yamoussoukro\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The official capital of Côte d\u0027Ivoire\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }