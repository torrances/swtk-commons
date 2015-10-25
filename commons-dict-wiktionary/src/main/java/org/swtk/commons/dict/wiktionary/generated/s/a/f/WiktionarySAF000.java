package org.swtk.commons.dict.wiktionary.generated.s.a.f;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySAF000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("safebreaker", "{\"term\":\"safebreaker\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|safe|gloss1\u003dsecure container|breaker|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person, usually criminal, who breaks into safes; a safecracker\", \"priority\":1}]}, \"synonyms\":{}}");

	add("safebreaking", "{\"term\":\"safebreaking\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|safe|breaking|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of breaking into a safe\", \"priority\":1}]}, \"synonyms\":{}}");

	add("safeguard", "{\"term\":\"safeguard\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\", \"old french (842-ca. 1400)\"], \"text\":\"From Middle french (ca. 1400-1600) \u0027sauvegarde\u0027 from Old french (842-ca. 1400) \u0027salve\u0027 \u0027garde\u0027 \u0027sauve\u0027 \u0027garde\u0027 reconstructed as \u0027\u0027 + \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Something that serves as a guard or protection; a defense\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Getting a flu shot is a good \u0027\u0027safeguard\u0027\u0027 against illness\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"One who, or that which, defends or protects; defence; protection\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Granvill\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Thy sword, the \u0027\u0027safeguard\u0027\u0027 of thy brother\u0027s throne\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A safe-conduct or passport, especially in time of war\", \"priority\":6}]}, \"synonyms\":{}}");

	add("safeguarding", "{\"term\":\"safeguarding\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"protection\", \"priority\":1}]}, \"synonyms\":{}}");

	add("safety", "{\"term\":\"safety\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027sauveté\u0027 from an earlier \u0027salvetet\u0027 from \u0027salvitas\u0027 \u0027salvitatem\u0027 from Latin \u0027salvus\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition or feeling of being safe; security; certainty\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"If you push it to the limit, \u0027\u0027safety\u0027\u0027 is not guaranteed\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A mechanism on a weapon or dangerous equipment designed to prevent accidental firing\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Be sure that the \u0027\u0027safety\u0027\u0027 is set before proceeding\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"An instance of a player being sacked or tackled in the end zone, or steps out of the end zone and off the field, resulting in two points for the opposite team\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"He sacked the quarterback in the end zone for a \u0027\u0027safety\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Any of the defensive players who are in position furthest from the line of scrimmage and whose responsibility is to defend against passes as well as to be the tacklers of last resort\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"The free \u0027\u0027safety\u0027\u0027 made a game-saving tackle on the runner who had broken past the linebackers\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Preservation from escape; close custody\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"Shakespear\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"Imprison him, / Deliver him to \u0027\u0027safety\u0027\u0027; and return\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"A safety bicycle\", \"priority\":12}]}, \"synonyms\":{}}");

	add("safeword", "{\"term\":\"safeword\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|safe|word|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A word used in sadomasochistic sexual practices to indicate that a participant wants to stop\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, Felice Newman, \u0027The Whole Lesbian Sex Book\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Likewise, a top\u0027s ability to respond to your \u0027\u0027safeword\u0027\u0027 is what makes her a safe partner\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, Tristan Taormino, \u0027The Ultimate Guide to Anal Sex for Women\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"If you don\u0027t like something that\u0027s happening or you want the scene to stop right away, simply say your \u0027\u0027safeword\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, Sloan Christopher, \u0027Dangerous Obsession\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"My guess is our victims probably used their \u0027\u0027safewords\u0027\u0027 or protested at some point, but our guy doesn\u0027t care about safewords or the BDSM creed\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }