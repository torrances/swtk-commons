package org.swtk.commons.dict.wiktionary.generated.k.e.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKEI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("keister", "{\"term\":\"keister\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Origin uncertain. Originally attested as a criminal cant word for \u0026quot;burglar\u0027s tool-box\u0026quot; in 1881. In the XX century a clutch of criminal slang meanings are mentioned, including \u0026quot;safe, strongbox\u0026quot;. \u0026quot;Tripe and keister\u0026quot; had been the phrase for a conman\u0027s or a pitchman\u0027s display case on a tripod.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The buttocks\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A safe, a strongbox\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1953\u0027\u0027, Richard S. Prather, \u0027Too many crooks\u0027, [http://books.google.ru/books?id\u003d-dKfwslFFEoC\u0026amp;lpg\u003dPA100\u0026amp;dq\u003dkeister\u0026amp;pg\u003dPA10\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003dkeister\u0026amp;f\u003dfalse page 100\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"― \u0026quot; [...] The four hundred\u0027s yours to take a \u0027\u0027keister\u0027\u0027 for me. Any cash you find in the box is yours.\u0026quot\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"― \u0026quot;Four hundred, huh? Don\u0027t seem like much. Think there\u0027d be anything in the \u0027\u0027keister\u0027\u0027?\u0026quot\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A suitcase; a satchel\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"1942\u0027\u0027, Billboard, 29 Aug 1942 — page 6\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Tripods, \u0027\u0027keister\u0027\u0027 and loud talk don\u0027t make a pitchman any more than do fine feathers make fine birds\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"1963\u0027\u0027, Grace Snyder, Nellie Irene Snyder Yost, \u0027No Time on My Hands\u0027, [http://books.google.ru/books?id\u003dblz2F9bKBn0C\u0026amp;lpg\u003dPA37\u0026amp;dq\u003dkeister\u0026amp;pg\u003dPA3\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003dkeister\u0026amp;f\u003dfalse page 37\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"Sometimes Mama was too busy to make the daily rounds of the draws and pockets, in which case she gave us the \u0027\u0027keister\u0027\u0027 — an old leather satchel used, in its better days to carry the baby\u0027s \u0026quot;didies\u0026quot; in — and sent us to bring in the eggs\", \"priority\":12}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }