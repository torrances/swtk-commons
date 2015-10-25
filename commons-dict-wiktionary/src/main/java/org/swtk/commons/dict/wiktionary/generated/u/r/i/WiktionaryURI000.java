package org.swtk.commons.dict.wiktionary.generated.u.r.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryURI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("uricemia", "{\"term\":\"uricemia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An elevated level of uric acid in the blood\", \"priority\":1}]}, \"synonyms\":{}}");

	add("uricosuria", "{\"term\":\"uricosuria\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The presence of uric acid in the urine\", \"priority\":1}]}, \"synonyms\":{}}");

	add("uricotelism", "{\"term\":\"uricotelism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The excretion of uric acid or its salts as a result of deamination\", \"priority\":1}]}, \"synonyms\":{}}");

	add("uridine", "{\"term\":\"uridine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A nucleoside formed from uracil and ribose\", \"priority\":1}]}, \"synonyms\":{}}");

	add("urinomics", "{\"term\":\"urinomics\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|urine|omics|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The identification of the totality of the constituents of the urine of an organism\", \"priority\":1}]}, \"synonyms\":{}}");

	add("uritis", "{\"term\":\"uritis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"inflammation following a burn\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }