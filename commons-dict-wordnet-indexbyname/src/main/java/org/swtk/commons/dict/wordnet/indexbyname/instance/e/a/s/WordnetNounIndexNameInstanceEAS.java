package org.swtk.commons.dict.wordnet.indexbyname.instance.e.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"eas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07239583\"]}");
	add("{\"term\":\"ease\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01066072\", \"04794222\", \"14469215\", \"14515473\", \"04715389\"]}");
	add("{\"term\":\"easel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03267512\"]}");
	add("{\"term\":\"easement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00355710\", \"05186707\"]}");
	add("{\"term\":\"easiness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01226835\", \"04715389\", \"07531213\"]}");
	add("{\"term\":\"easing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00355710\", \"07371701\"]}");
	add("{\"term\":\"east\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"08578888\", \"13857863\", \"08580717\", \"08580157\", \"13854554\"]}");
	add("{\"term\":\"easter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11468680\", \"15212989\"]}");
	add("{\"term\":\"easterly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11468680\"]}");
	add("{\"term\":\"easterner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10061882\"]}");
	add("{\"term\":\"eastertide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15216422\"]}");
	add("{\"term\":\"eastman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10967620\"]}");
	add("{\"term\":\"eastward\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13854554\"]}");
	add("{\"term\":\"easygoingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04648079\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }