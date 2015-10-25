package org.swtk.commons.dict.wiktionary.generated.p.n.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPNI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pnictide", "{\"term\":\"pnictide\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|pnic|t|ide|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any binary compound of a pnictogen\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pnictogen", "{\"term\":\"pnictogen\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027πνίγειν\u0027 (to choke, to stifle) (a property of nitrogen) + \u0027\u0027 with \u0027-t-\u0027 in some forms, perhaps by analogy with \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any element from group 15 of the periodic table; nitrogen, phosphorus, arsenic, antimony and bismuth\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }