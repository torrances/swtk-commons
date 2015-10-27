package org.swtk.commons.dict.wordnet.index.name.instance.c.l.o.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCLOC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"clochard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10764201\"]}");
	add("{\"term\":\"cloche\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03050014\", \"03050118\"]}");
	add("{\"term\":\"clock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03050242\"]}");
	add("{\"term\":\"clocking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15158855\"]}");
	add("{\"term\":\"clockmaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09949560\"]}");
	add("{\"term\":\"clocks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12709664\"]}");
	add("{\"term\":\"clocksmith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09949560\"]}");
	add("{\"term\":\"clockwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03051156\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }