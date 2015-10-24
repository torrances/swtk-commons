package org.swtk.commons.dict.wiktionary.generated.p.y.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPYE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pyet", "{\"term\":\"pyet\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027pie\u0027 + \u0027-et\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A magpie; a water ouzel\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1819\u0027\u0027: ”Here cometh the worthy prelate, as pert as a \u0027\u0027pyet\u0027\u0027.” — Walter Scott, \u0027Ivanhoe\", \"priority\":2}]}, \"synonyms\":{}}");

	add("pyelonephritis", "{\"term\":\"pyelonephritis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|pyelo|nephritis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An ascending urinary tract infection that has reached the pelvis of the kidney\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }