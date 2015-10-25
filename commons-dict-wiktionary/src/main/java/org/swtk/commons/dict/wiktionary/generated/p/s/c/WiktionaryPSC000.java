package org.swtk.commons.dict.wiktionary.generated.p.s.c;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPSC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pschent", "{\"term\":\"pschent\", \"etymology\":{\"influencers\":[], \"languages\":[\"egyptian (ancient)\", \"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027ψχεντ\u0027 () from Late Egyptian (ancient) \u0027p3-sḫnt\u0027 (that which promotes) from \u0027p3\u0027 (definite article) + \u0027sḫnt\u0027 (to promote)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the double crown of ancient Egypt, combining the white crown of Upper Egypt with the red crown of Lower Egypt, worn by pharaohs after the union of the two kingdoms in around 3000 B\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1922\u0027\u0027, James Joyce, \u0027Ulysses\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"In his left eye flashes the monocle of Cashel Boyle O’Conner Fitzmaurice Tisdall Farrell. On his head is perched an Egyptian \u0027\u0027pshent\u0027\u0027. Two quills project over his ears\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }