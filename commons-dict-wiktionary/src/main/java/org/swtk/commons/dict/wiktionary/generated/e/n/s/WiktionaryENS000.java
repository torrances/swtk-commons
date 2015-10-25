package org.swtk.commons.dict.wiktionary.generated.e.n.s;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryENS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ensemble", "{\"term\":\"ensemble\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|fr|ensemble|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a group of separate things that contribute to a coordinated whol\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a coordinated costume or outfit; a sui\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"a group of musicians, dancers, actors, etc who perform together; e.g. the chorus of a ballet compan\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"12 July 2012\u0027\u0027, Sam Adams, AV Club \u0027Ice Age: Continental Drift\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"On paper, Continental Drift boasts a jaw-dropping voice cast, including but not limited to Jennifer Lopez, Patrick Stewart, Wanda Sykes, Aziz Ansari, Simon Pegg, Nick Frost, Nicki Minaj, Drake, and Alan Tudyk. But in practice, the overstuffed \u0027\u0027ensemble\u0027\u0027 leaves the cast no room to distinguish themselves, and directors Steve Martino and Michael Thurmeier don’t seem interested in coaxing performances that might render their money stars less identifiable\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"a piece for several instrumentalists or vocalists\", \"priority\":6}]}, \"synonyms\":{}}");

	add("ensifer", "{\"term\":\"ensifer\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"Borrowed from Latin {{m|la|ēnsifer||sword-bearing}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A member of the genus , the bacteria family of Rhizobiaceae\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ensign", "{\"term\":\"ensign\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027enseigne\u0027 \u0026lt; Latin {{m|la|īnsignia}}, nominative plural of {{m|la|īnsigne}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A badge of office, rank, or power\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1606-1687\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027ensigns\u0027\u0027 of our power about we bear\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The lowest grade of commissioned officer in the United States Navy, junior to a lieutenant junior grade\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"chapter\u003d10|passage\u003dThe skipper Mr. Cooke had hired at Far Harbor was a God-fearing man with a luke warm interest in his new billet and employer, and had only been prevailed upon to take charge of the yacht after the offer of an emolument equal to half a year\u0027s sea pay of an \u0027\u0027ensign\u0027\u0027 in the navy\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A flag or banner carried by military units. See standard, color, colour\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"1564-1616\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Hang up your \u0027\u0027ensigns\u0027\u0027, let your drums be still\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"The principal flag or banner flown by a ship to indicate nationality\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"A junior commissioned officer in the 18th and 19th Centuries whose duty was to carry the unit\u0027s ensign\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"A prominent flag or banner\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"Ten thousand thousand \u0027\u0027ensigns\u0027\u0027 high advanced\", \"priority\":12}]}, \"synonyms\":{}}");

	add("enstasis", "{\"term\":\"enstasis\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"Ancient greek (to 1453)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Contemplation of one\u0027s own self\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }