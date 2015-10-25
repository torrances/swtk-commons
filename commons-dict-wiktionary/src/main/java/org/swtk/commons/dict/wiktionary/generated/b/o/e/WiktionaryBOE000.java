package org.swtk.commons.dict.wiktionary.generated.b.o.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBOE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("boer", "{\"term\":\"boer\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"Afrikaans\", \"English\"], \"text\":\"{{PIE root|en|bʰuH}}From Afrikaans \u0027boer\u0027 (farmer)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Dutch colonist in South Africa, or one of their (white) descendants, especially a farmer; an Afrikaner\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1979\u0027\u0027, \u0027A Dry White Season\u0027, Vintage 1998, p. 93\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"‘I won\u0027t say good day to a fucking \u0027\u0027\u0027boer\u0027\u0027\u0027!’ he exploded, swinging round viciously to escape into the angry light outside\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A militant in the\", \"priority\":4}]}, \"synonyms\":{}}");

	add("boet", "{\"term\":\"boet\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Afrikaans \u0027boet|lang\u003daf\u0027 () 1908, Dutch regional (Zeeland and West Flemish) \u0027boet|lang\u003dnl\u0027 () (from the second half of the 19th century), probably a hypocoristic form of \u0027broeder|lang\u003dnl\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A brother, often prefixed informally to a man’s first name\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"As a familiar form of address: pal, mate\", \"priority\":2}]}, \"synonyms\":{}}");

	add("boeotia", "{\"term\":\"boeotia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027boeotia\u0027 from Ancient greek (to 1453) \u0027βοιωτία\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A district of Ancient Greece, formerly renowned for the proverbial stupidity of its inhabitants; now, a district in east Central Greece, situated on the peninsula, west of Euboea, north of Attica and Megaris, and east of Phokis. The present-day capital of the prefecture is Levadeia\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }