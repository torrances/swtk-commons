package org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJOL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"joliet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11109474\"]}");
	add("{\"term\":\"joliot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11108959\"]}");
	add("{\"term\":\"jolliet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11109474\"]}");
	add("{\"term\":\"jollification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00510857\"]}");
	add("{\"term\":\"jolliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07567356\"]}");
	add("{\"term\":\"jollity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07567356\"]}");
	add("{\"term\":\"jolly\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03607294\", \"07464943\"]}");
	add("{\"term\":\"jolly boat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03607294\"]}");
	add("{\"term\":\"jolly roger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02850247\"]}");
	add("{\"term\":\"jolson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11109659\"]}");
	add("{\"term\":\"jolt\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00336814\", \"07353698\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }