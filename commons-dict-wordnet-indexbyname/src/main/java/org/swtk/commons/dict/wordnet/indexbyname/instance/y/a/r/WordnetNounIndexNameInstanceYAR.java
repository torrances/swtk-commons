package org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceYAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"yard\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"04617860\", \"04618033\", \"04618511\", \"08702414\", \"13639357\", \"13772984\", \"08702032\", \"04618236\", \"13672065\"]}");
	add("{\"term\":\"yardage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05138140\"]}");
	add("{\"term\":\"yardarm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04618708\"]}");
	add("{\"term\":\"yardbird\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09982445\", \"10822111\"]}");
	add("{\"term\":\"yarder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04618827\", \"13672353\"]}");
	add("{\"term\":\"yardgrass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12138931\"]}");
	add("{\"term\":\"yardie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10822225\"]}");
	add("{\"term\":\"yardman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10822446\", \"10822557\"]}");
	add("{\"term\":\"yardmaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10822635\"]}");
	add("{\"term\":\"yardstick\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04619273\", \"07276623\"]}");
	add("{\"term\":\"yarmelke\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04619383\"]}");
	add("{\"term\":\"yarmulka\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04619383\"]}");
	add("{\"term\":\"yarmulke\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04619383\"]}");
	add("{\"term\":\"yarn\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04433923\", \"07235433\"]}");
	add("{\"term\":\"yarrow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11937165\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }