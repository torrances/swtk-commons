package org.swtk.commons.dict.wiktionary.generated.u.p.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUPK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("upkeep", "{\"term\":\"upkeep\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|up|keep|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Maintenance; the act or effort of keeping something in good and working condition\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"I would enjoy having a swimming pool, but I don\u0027t want to deal with the \u0027\u0027upkeep\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"it was unnecessary to fence off pasture from arable land, which saved a lot of labour on the \u0027\u0027upkeep\u0027\u0027 of hedges and gates\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }