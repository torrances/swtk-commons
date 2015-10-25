package org.swtk.commons.dict.wiktionary.generated.z.u.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryZUG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("zugzwang", "{\"term\":\"zugzwang\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\"], \"text\":\"From German \u0027zugzwang\u0027 from \u0027zug\u0027 (move) + \u0027zwang\u0027 (compulsion)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A situation in which a player is forced to make a disadvantageous move\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2002\u0027\u0027: Carl Friedrich Graumann and Werner Kallmeyer [eds.], \u0027Perspective and Perspectivation in Discourse\u0027, \u0026lt;span class\u003d\u0026quot;plainlinks\u0026quot;\u0026gt;[http://books.google.co.uk/books?id\u003dx8dhaQsZXcIC\u0026amp;pg\u003dPA174\u0026amp;dq\u003dzugzw%C3%A4nge\u0026amp;hl\u003den\u0026amp;ei\u003dYJZiTKfnIZG84AaftfjgCg\u0026amp;sa\u003dX\u0026amp;oi\u003dbook_result\u0026amp;ct\u003dresult\u0026amp;resnum\u003d49\u0026amp;ved\u003d0CMsCEOgBMD\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u0026amp;f\u003dfalse page 174]\u0026lt;/span\u0026gt\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"An explanation for this phenomenon may be that speech acts that include instructions (e.g., a command or request) show a higher level of activity than speech acts of assertion; the ethnomethodological analysis of conversation speaks of conversational \u0027\u0027\u0027Zugzwänge\u0027\u0027\u0027:\u0026lt;sup\u0026gt;24\u0026lt;/sup\u0026gt; a request, a question or a command demands a reaction of the addressee\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }