package org.swtk.commons.dict.wordnet.index.name.instance.a.l.b.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALBA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"albacore\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02629667\", \"07796850\"]}");
	add("{\"term\":\"albania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08722636\"]}");
	add("{\"term\":\"albanian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06955014\", \"09709354\"]}");
	add("{\"term\":\"albany\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09099044\", \"09140980\"]}");
	add("{\"term\":\"albatrellus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13071315\"]}");
	add("{\"term\":\"albatross\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02060875\", \"05697450\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }