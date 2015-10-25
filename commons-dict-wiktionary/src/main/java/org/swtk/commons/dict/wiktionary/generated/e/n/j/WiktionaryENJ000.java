package org.swtk.commons.dict.wiktionary.generated.e.n.j;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryENJ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("enjambment", "{\"term\":\"enjambment\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"From French \u0027enjambement\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A technique in poetry whereby a sentence is carried over to the next line without pause\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An instance of this\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"quot;\u0027The tide is full, the moon lies fair\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Upon the straits; - on the French coast the light\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Gleams and is gone...\u0027\u0026quot\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Lines 2 - 4, \u0026quot;Dover Beach\u0026quot; by (1851\", \"priority\":6}]}, \"synonyms\":{}}");

	add("enjoyability", "{\"term\":\"enjoyability\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|enjoy|ability|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or condition of being enjoyable\", \"priority\":1}]}, \"synonyms\":{}}");

	add("enjoyableness", "{\"term\":\"enjoyableness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|enjoyable|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality or state of being enjoyable\", \"priority\":1}]}, \"synonyms\":{}}");

	add("enjoyer", "{\"term\":\"enjoyer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|enjoy|er|lang\u003den}}. * \u0027\u00272010\u0027\u0027, Donald J. Mastronarde, \u0027The Art of Euripides: Dramatic Technique and Social Context\u0027 (page 118). *: Intense emotional involvement is thus combined with moments of withdrawal in which the audi\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who enjoys\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027, Donald J. Mastronarde, \u0027The Art of Euripides: Dramatic Technique and Social Context\u0027 (page 118\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Intense emotional involvement is thus combined with moments of withdrawal in which the audience is reminded of its status as observers, outsiders, interpreters, and \u0027\u0027enjoyers\u0027\u0027 of the action\", \"priority\":3}]}, \"synonyms\":{}}");

	add("enjoyment", "{\"term\":\"enjoyment\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|enjoy|ment|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of enjoying anything\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"chapter\u003d5|passage\u003dThen we relapsed into a discomfited silence, and wished we were anywhere else. But Miss Thorn relieved the situation by laughing aloud, and with such a hearty \u0027\u0027enjoyment\u0027\u0027 that instead of getting angry and more mortified we began to laugh ourselves, and instantly felt better\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An enjoyable state of mind\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"title\u003dS:Remarks on Bentham\u0027s Remarks on Bentham\u0027s year\u003d1833\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"An activity that gives pleasure\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"year\u003d1885|year_published\u003d1605, 1615\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The exercise of a legal right\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }