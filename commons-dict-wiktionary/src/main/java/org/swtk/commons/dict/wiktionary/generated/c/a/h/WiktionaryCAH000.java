package org.swtk.commons.dict.wiktionary.generated.c.a.h;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCAH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("cahier", "{\"term\":\"cahier\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|fr|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A number of sheets of paper put loosely together; especially one of the successive portions of a work printed in numbers\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A memorial of a body; a report of legislative proceedings, etc\", \"priority\":2}]}, \"synonyms\":{}}");

	add("cahinca", "{\"term\":\"cahinca\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Chiococca alba\u0027, a flowering plant in the coffee family\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cahnite", "{\"term\":\"cahnite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Cahn|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A tetragonal-disphenoidal mineral containing arsenic, boron, calcium, hydrogen, and oxygen\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cahoots", "{\"term\":\"cahoots\", \"etymology\":{\"influencers\":[{},{},{}], \"languages\":[\"English\", \"French\", \"old french (842-ca. 1400)\"], \"text\":\"This word was first used in popular English literature sometime before 1829.\u0026lt;ref\u0026gt;[http://www.websters-online-dictionary.org/definitions/cahoots?cx\u003dpartner-pub-0939450753529744%3Av0qd01-tdlq\u0026amp;cof\u003dFORID%3A9\u0026amp;ie\u003dUTF-8\u0026amp;q\u003dcahoots\u0026amp;sa\u003dSearc. 922 Date \u0026quot;Cahoots\u0026quot; was first used in popular English literature: sometime before 1829]\u0026lt;/ref\u0026gt;It comes perhaps from French \u0027cahute\u0027 (cabin) from Old french (842-ca. 1400) possibly blend of \u0027cabane\u0027 (cabin) and \u0027hutte\u0027 (hut) Also thought to be from French \u0027cohorte\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Collusion or collaboration to nefarious ends\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Being frustrated or up in \u0027\u0027cahoots\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"They probably give it back to him; they\u0027re all in \u0027\u0027cahoots\u0027\u0027.\u0027 \u0026amp;mdash; \u0027Rabbit at Rest\u0027, John Updike\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }