package org.swtk.commons.dict.wordnet.indexbyname.instance.t.e.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTED {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"te deum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07051130\"]}");
	add("{\"term\":\"ted\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10716631\"]}");
	add("{\"term\":\"ted hughes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11085224\"]}");
	add("{\"term\":\"ted shawn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11316592\"]}");
	add("{\"term\":\"ted williams\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11409896\"]}");
	add("{\"term\":\"teddy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03017234\", \"04406517\"]}");
	add("{\"term\":\"teddy bear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04406517\"]}");
	add("{\"term\":\"teddy boy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10716631\"]}");
	add("{\"term\":\"teddy boys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08387131\"]}");
	add("{\"term\":\"tediousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05213505\"]}");
	add("{\"term\":\"tedium\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05213505\", \"07555178\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }