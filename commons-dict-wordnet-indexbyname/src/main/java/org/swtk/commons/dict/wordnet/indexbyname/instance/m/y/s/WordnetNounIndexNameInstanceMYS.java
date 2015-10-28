package org.swtk.commons.dict.wordnet.indexbyname.instance.m.y.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMYS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mysidacea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01991612\"]}");
	add("{\"term\":\"mysidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01991738\"]}");
	add("{\"term\":\"mysis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01991895\"]}");
	add("{\"term\":\"mysoandry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07562607\"]}");
	add("{\"term\":\"mysoline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04009289\"]}");
	add("{\"term\":\"mysophilia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07514008\"]}");
	add("{\"term\":\"mysophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14407253\"]}");
	add("{\"term\":\"mysore\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08922385\", \"08924699\"]}");
	add("{\"term\":\"mystery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06382415\", \"05693343\"]}");
	add("{\"term\":\"mystic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10363285\"]}");
	add("{\"term\":\"mysticeti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02065644\"]}");
	add("{\"term\":\"mysticism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05792565\", \"05957724\"]}");
	add("{\"term\":\"mystification\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01268645\", \"03809451\", \"05692835\"]}");
	add("{\"term\":\"mystifier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06797496\"]}");
	add("{\"term\":\"mystique\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04734817\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }