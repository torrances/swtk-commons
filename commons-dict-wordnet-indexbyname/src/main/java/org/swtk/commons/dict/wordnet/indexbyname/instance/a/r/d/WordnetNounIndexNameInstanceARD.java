package org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"arda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08357680\"]}");
	add("{\"term\":\"ardea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02010970\"]}");
	add("{\"term\":\"ardea herodius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02011151\"]}");
	add("{\"term\":\"ardea occidentalis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02011297\"]}");
	add("{\"term\":\"ardeb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13637621\"]}");
	add("{\"term\":\"ardeidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02010375\"]}");
	add("{\"term\":\"ardennes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08961454\"]}");
	add("{\"term\":\"ardennes counteroffensive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01273600\"]}");
	add("{\"term\":\"ardent spirits\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07918576\"]}");
	add("{\"term\":\"ardisia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12117697\"]}");
	add("{\"term\":\"ardisia crenata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12117913\"]}");
	add("{\"term\":\"ardisia escallonoides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12118073\"]}");
	add("{\"term\":\"ardisia paniculata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12118073\"]}");
	add("{\"term\":\"ardor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07496515\", \"07559517\", \"07570967\"]}");
	add("{\"term\":\"ardour\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07496515\", \"07559517\", \"07570967\"]}");
	add("{\"term\":\"ards\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14078534\"]}");
	add("{\"term\":\"arduousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04717035\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }