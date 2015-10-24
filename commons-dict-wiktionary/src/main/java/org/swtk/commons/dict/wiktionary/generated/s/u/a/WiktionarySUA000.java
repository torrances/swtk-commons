package org.swtk.commons.dict.wiktionary.generated.s.u.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySUA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("suasion", "{\"term\":\"suasion\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of urging or influencing; persuasion\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1977\u0027\u0027, w:Stephen R. Stephen R. Donaldson, \u0027The Illearth War\u0027, page 75\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The high intricate ways of the Keep had a strange power of \u0027\u0027suasion\u0027\u0027, an ability to carry conviction\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1982\u0027\u0027, Jacob Kipp, \u0026quot;Review of \u0027The Royal Navy and the Siege of Bilbao\u0027 by James Cable,\u0026quot; \u0027Military Affairs\u0027, vol. 46, no. 4, page 217\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"James Cable, the author of \u0027Gunboat Diplomacy\u0027 (Chatto \u0026amp; Windus, 1971), has created an excellent case study of naval presence and \u0027\u0027suasion\u0027\u0027 during the era of appeasement\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }