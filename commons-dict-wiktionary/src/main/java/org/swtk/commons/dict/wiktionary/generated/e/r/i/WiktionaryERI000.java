package org.swtk.commons.dict.wiktionary.generated.e.r.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryERI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ericssonite", "{\"term\":\"ericssonite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Ericsson|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A monoclinic-prismatic reddish black mineral containing barium, hydrogen, iron, manganese, oxygen, and silicon\", \"priority\":1}]}, \"synonyms\":{}}");

	add("erinys", "{\"term\":\"erinys\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027ἐρινύς\u0027 Possibly \u0027the angry spirits\u0027 from the Greek \u0027orinein\u0027, (to raise, stir, excite [towards anger])\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One of the female personifications of vengeance, particularly wrong or immoral deeds on behalf of the victims\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }