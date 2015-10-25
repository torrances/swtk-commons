package org.swtk.commons.dict.wiktionary.generated.r.a.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryRAL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("raleigh", "{\"term\":\"raleigh\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the county seat of Wake County and the capital of North Carolin\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"an English place name, surname and given nam\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"w:Walter Sir Walter Raleigh English explorer and soldie\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"an English bicycle manufacturer\", \"priority\":4}]}, \"synonyms\":{}}");

	add("rallycross", "{\"term\":\"rallycross\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A format of car racing in which drivers race over wild terrain and specially designed roads\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ralph", "{\"term\":\"ralph\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"From Proto-germanic {{m|gem-pro|*Rēdawulfaz}}, brought to England first in the Old Norse (\u0027ráðúlfr\u0027 , then in the Norman form.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"1594\u0027\u0027 William Shakespeare: \u0027The Taming of the Shrew\u0027: Act IV, Scene I\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"There were none fine but Adam, \u0027\u0027Ralph\u0027\u0027, and Gregory: / The rest were ragged, old, and beggarl\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1998\u0027\u0027 w:The The Spectator, 7 March 1998, page 55 (\u0026quot;Dear Mary...\u0026quot\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Regarding the correct pronunciation, especially of the name \u0027\u0027Ralph\u0027\u0027: according to a friend at the BBC, the possibilities of this name - either aristocratic \u0027Rafe\u0027 or vulgar, almost Australasian \u0027Ralff\u0027 - lie in its potential for wilful mispronunciation against type. I saw him cast confusion into an over-confident studio guest by introducing him as \u0027Sir Rafe Halpern\u0027. This was nothing to the consternation, almost disintegration of the personality, of the artistic, aloof actor brought on as \u0027Rolf Fiennes\u0027 (\u0027Fiennes\u0027, naturally, pronounced superbly\", \"priority\":4}]}, \"synonyms\":{}}");

	add("ralphie", "{\"term\":\"ralphie\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From Ralph Gardeners High School in North Shields which had a past reputation as a bad school.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A scruffy school child\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ralstonism", "{\"term\":\"ralstonism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Everett Ralston, pseudonym of founder Webster Edgerly (1852-1926), and \u0027-ism\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A minor social movement in the USA in the nineteenth century, promoting white superiority, a diet and exercise regime, and the supposed ability to develop control over the minds of others\", \"priority\":1}]}, \"synonyms\":{}}");

	add("raltitrexed", "{\"term\":\"raltitrexed\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A particular drug used in chemotherapy\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }