package org.swtk.commons.dict.wiktionary.generated.i.n.q;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryINQ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("inquiry", "{\"term\":\"inquiry\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"Middle english (1100-1500) \u0027enquery\u0027 from the Old french (842-ca. 1400) verb \u0027enquerre\u0027 from Latin {{m|la|inquīrō}}. Later respelled to conform to the original Latin spelling, as opposed to the Old French spelling.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of inquiring; a seeking of information by asking questions; interrogation; a question or questioning\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Search for truth, information, or knowledge; examination of facts or principles; research; investigation; as, physical inquiries\", \"priority\":2}]}, \"synonyms\":{}}");

	add("inquisition", "{\"term\":\"inquisition\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027inquisicion\u0027 from Latin \u0027inquisitio\u0027 from \u0027inquirere\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"an investigation or inquiry into the truth of some matte\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Latime\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"as I could learn through earnest \u0027\u0027inquisition\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Shakespear\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Let not search and \u0027\u0027inquisition\u0027\u0027 quail / To bring again these foolish runaways\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"an inques\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"a questionin\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"The finding of a jury, especially such a finding under a writ of inquiry\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Blackston\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"The justices in eyre had it formerly in charge to make \u0027\u0027inquisition\u0027\u0027 concerning them by a jury of the county\", \"priority\":10}]}, \"synonyms\":{}}");

	add("inquisitiveness", "{\"term\":\"inquisitiveness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being inquisitive; curiosity\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }