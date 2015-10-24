package org.swtk.commons.dict.wiktionary.generated.v.i.x;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVIX000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("vixen", "{\"term\":\"vixen\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\"], \"text\":\"Alteration of {{m|en|fixen||female fox}}, from Middle english (1100-1500) {{m|enm|fixen}}, from Old english (ca. 450-1100) {{m|ang|fixen}}, {{m|ang|*fyxen}}, {{m|ang|fyxe||female fox}}, from Proto-germanic {{m|gem-pro|*fuhsinjō||female fox}}. Voiced \u0027v-\u0027 is from Southern dialect. Compare German \u0027füchsin\u0027 (female fox) See also \u0027fox\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A female fox\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A malicious, quarrelsome or temperamental woman\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1859:\u0027\u0027, w:George George Eliot. \u0027Adam Bede\u0027: page 54. Köln: Könemann Verlagsgesellschaft mbH, 1999\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"and if Solomon was as wise as he is reputed to be, I feel sure that when he compared a contentious woman to a contiunal dropping on a very rainy day, he had not a \u0027\u0027vixen\u0027\u0027 in his eye\u0026amp;ndash;a fury with long nails, acrid and selfish\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A racy or salacious woman\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }