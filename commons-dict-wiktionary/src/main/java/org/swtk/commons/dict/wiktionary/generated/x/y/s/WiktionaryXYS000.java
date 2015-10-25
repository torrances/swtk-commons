package org.swtk.commons.dict.wiktionary.generated.x.y.s;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryXYS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("xysma", "{\"term\":\"xysma\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"material resembling bits of membrane in stools of diarrhea\", \"priority\":1}]}, \"synonyms\":{}}");

	add("xyster", "{\"term\":\"xyster\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027ξυστήρ\u0027 (scraper) from \u0027ξύω\u0027 (scrape)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A surgical instrument used to scrape bones\", \"priority\":1}]}, \"synonyms\":{}}");

	add("xystus", "{\"term\":\"xystus\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027ξυστός\u0027 (xystus) from \u0027ξυστός\u0027 (scraped) from \u0027ksύω\u0027 (scrape) referring to its polished floor.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A long and open portico within the gymnasium\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }