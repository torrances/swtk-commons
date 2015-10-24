package org.swtk.commons.dict.wiktionary.generated.o.l.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOLY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("olympiad", "{\"term\":\"olympiad\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) {{m|fro|olimpiade||period of four years}}, from Latin {{m|la|Olympias}}, from Ancient greek (to 1453) {{m|grc|Ὀλυμπιάς}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A period of four years, by which the ancient Greeks reckoned time, being the interval from one celebration of the Olympic games to another, beginning with the victory of Corbus in the foot race, which took place in the year 776 b.c.; as, the era of the olympiads\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An occurrence of the Olympic games\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A competition or series of competitions resembling an Olympiad, especially in science\", \"priority\":3}]}, \"synonyms\":{}}");

	add("olympicene", "{\"term\":\"olympicene\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Olympic|ene|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A pentacyclic aromatic hydrocarbon whose structure is in the form of the Olympic rings\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }