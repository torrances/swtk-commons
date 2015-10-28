package org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUNT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"untangling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01247140\"]}");
	add("{\"term\":\"untermeyer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11376278\"]}");
	add("{\"term\":\"unthoughtfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04669063\"]}");
	add("{\"term\":\"untidiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04904605\", \"14523178\"]}");
	add("{\"term\":\"untier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10757088\"]}");
	add("{\"term\":\"untimeliness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04730383\", \"05056609\"]}");
	add("{\"term\":\"untouchable\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10759538\"]}");
	add("{\"term\":\"untrustiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04677888\"]}");
	add("{\"term\":\"untrustworthiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04677888\"]}");
	add("{\"term\":\"untruth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06769118\"]}");
	add("{\"term\":\"untruthfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04883248\"]}");
	add("{\"term\":\"untying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00150082\"]}");
	add("{\"term\":\"untypicality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14526644\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }