package org.swtk.commons.dict.wiktionary.generated.g.l.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGLE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gleam", "{\"term\":\"gleam\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"* {{qualifier|noun}} Originates before the first millennium from Middle English \u0027gleme\u0027, from Old English \u0027glæm\u0027, from Proto-germanic {{m|gem-pro|*glaimiz}}; see Proto-indo-european {{m|ine-pro|*ghel-}}.* {{qualifier|verb}} Derived from the Middle English noun form before the first millennium.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a small or indistinct shaft or stream of light\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Longfello\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A glimmer, and then a \u0027\u0027gleam\u0027\u0027 of light\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"a glimpse or hint; an indistinct sign of something\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The rescue workers preserved a \u0027\u0027gleam\u0027\u0027 of optimism that they might still survive\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"brightness or shininess; splendor\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Alexander Pop\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"In the clear azure \u0027\u0027gleam\u0027\u0027 the flocks are seen\", \"priority\":8}]}, \"synonyms\":{}}");

	add("glebe", "{\"term\":\"glebe\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027glebe\u0027 from Latin \u0027gleba|glēba\u0027 \u0026quot;lump of earth, a clod\u0026quot;.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Turf; soil; ground; sod\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1768,\u0027\u0027 w:Thomas Thomas Gray, \u0027s:Elegy Written in a Country Elegy Written in a Country Churchyard\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Oft did the harvest to their sickle yield\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Their furrow oft the stubborn \u0027\u0027glebe\u0027\u0027 has brok\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"In medieval Europe, an area of land, belonging to a parish, whose revenues contributed towards the parish expenses\", \"priority\":5}]}, \"synonyms\":{}}");

	add("gleet", "{\"term\":\"gleet\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\"], \"text\":\"Old french (842-ca. 1400) \u0027glette\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Stomach mucus, especially of a hawk\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Any slimy, viscous substance\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A urethral discharge, especially as a symptom of gonorrhoea\", \"priority\":3}]}, \"synonyms\":{}}");

	add("gleeman", "{\"term\":\"gleeman\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) {{m|enm|gleeman}}, from Old english (ca. 450-1100) {{m|ang|glīġman}}, {{m|ang|glēoman}}, corresponding to {{compound|glee|man|lang\u003den}}. Cognate with Scots {{m|sco|gle-man}}, {{m|sco|gleman||gleeman, minstrel}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A professional singer, bard, or other entertainer\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1948\u0027\u0027 (revised 1952), Robert Graves, \u0027The White Goddess\u0027, Faber \u0026amp; Faber 1999, p. 17\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The ancient Celts carefully distinguished the poet, who was originally a priest and judge as well and whose person was sacrosanct, from the mere \u0027\u0027gleeman\", \"priority\":3}]}, \"synonyms\":{}}");

	add("gleichschaltung", "{\"term\":\"gleichschaltung\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\"], \"text\":\"From German German|Gleichschaltung\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The forced standardization of political and social institutions under an authoritarian regime, originally with reference to Nazi Germany\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, Perry Anderson, ‘Russia\u0027s Managed Democracy’, \u0027London Review of Books\u0027 29:2, page 3\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Putin\u0027s control of the media is becoming more and more comprehensive. [...] The \u0027\u0027\u0027Gleichschaltung\u0027\u0027\u0027 of parliament and political parties is, if anything, even more impressive\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2014\u0027\u0027, Philip Ball, \u0027Serving the Reich\u0027, The Bodley Head, page 61\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Planck [...] had bought the (relative) autonomy and security of German physics at the cost of a servile, self-imposed \u0027\u0027\u0027Gleichschaltung\u0027\u0027\u0027 – the alignment with Nazi doctrine that the party demanded in all aspects of German society\", \"priority\":5}]}, \"synonyms\":{}}");

	add("glenzing", "{\"term\":\"glenzing\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A technique for simulating translucency by storing extra colour values in the palette that represent the combined colours of intersecting objects in a scene\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }