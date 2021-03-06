package org.swtk.commons.dict.wordnet.indexbyname.instance.a.m.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAMU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"amulet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02709445\"]}");
	add("{\"term\":\"amun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09534502\"]}");
	add("{\"term\":\"amun ra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09534654\"]}");
	add("{\"term\":\"amundsen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10835827\"]}");
	add("{\"term\":\"amur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09218981\"]}");
	add("{\"term\":\"amur privet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12328629\"]}");
	add("{\"term\":\"amur river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09218981\"]}");
	add("{\"term\":\"amusd\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06716285\"]}");
	add("{\"term\":\"amusement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00430033\", \"07506616\"]}");
	add("{\"term\":\"amusement arcade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02709665\"]}");
	add("{\"term\":\"amusement park\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08511241\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }