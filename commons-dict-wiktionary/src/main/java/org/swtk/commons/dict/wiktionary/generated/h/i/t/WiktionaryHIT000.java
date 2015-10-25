package org.swtk.commons.dict.wiktionary.generated.h.i.t;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHIT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hitch", "{\"term\":\"hitch\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\"], \"text\":\"Probably from Middle english (1100-1500) {{m|enm|hytchen}}, or {{m|enm|icchen||to move as with a jerk}}, of obscure origin. Lacks cognates in other languages.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Image:Two half hitches thumb|A hitch (knot that attaches to an object\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A sudden pull\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Any of various knots used to attach a rope to an object other than another rope \u0026lt;ref\u0026gt;Knots and Splices by Cyrus L Day, Adlard Coles Nautical, 2001\u0026lt;/ref\u0026gt;. See w:List of hitch \u0027List of hitch knots in Wikipedia\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A fastener or connection point, as for a trailer\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"His truck sported a heavy-duty \u0027\u0027hitch\u0027\u0027 for his boat\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A problem, delay or source of difficulty\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The banquet went off without a \u0027\u0027hitch\u0027\u0027.\u0027 (Meaning the banquet went smoothly\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A hidden or unfavorable condition or element; a catch\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"The deal sounds too good to be true. What\u0027s the \u0027\u0027hitch\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"A period of time. Most often refers to time spent in the military\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"She served two \u0027\u0027hitches\u0027\u0027 in Vietnam\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"U.S. TROOPS FACE LONGER ARMY \u0027\u0027HITCH\u0027\u0027 ; SOLDIERS BOUND FOR IRAQ, ... WILL BE RETAINED\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"Stephen J. Hedges \u0026amp; Mike Dorning, Chicago Tribune; Orlando Sentinel; Jun 3, 2004; pg. A.1\", \"priority\":13}]}, \"synonyms\":{}}");

	add("hithe", "{\"term\":\"hithe\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"Old english (ca. 450-1100) {{m|ang|hȳþ}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a landing-place in a river; a harbour or small port\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hitlerism", "{\"term\":\"hitlerism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From w:Adolf Hitler|Adolf Hitler (1889-1945), German politician.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The political philosophy and practices of w:Adolf Adolf Hitler and the Nazi party\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hitman", "{\"term\":\"hitman\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|hit|gloss1\u003dto murder|man|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A contract killer; especially one paid by mafia\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"goalscorer, someone who scores goals\", \"priority\":2}]}, \"synonyms\":{}}");

	add("hittite", "{\"term\":\"hittite\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"hittite\"], \"text\":\"From Hittite Coined erroneously in the early 20th century in confusion with the neighboring \u0027hattites\u0027 (\u0027hattic\u0027 whose language was recorded in discovered texts as \u0027tr\u003dhasili\u0027 It is now known that the Hittites called themselves \u0027tr\u003dnesili|𒉈𒅆𒇷\u0027 (pertaining to the city of nesa) hence the much less used alternative name \u0027nesite\u0027 or \u0027neshite\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person of the Hittite Kingdom, a Bronze Age kingdom of Anatolia\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }