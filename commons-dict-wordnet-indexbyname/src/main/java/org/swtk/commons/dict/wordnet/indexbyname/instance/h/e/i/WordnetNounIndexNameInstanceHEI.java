package org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHEI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"heidegger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11058289\"]}");
	add("{\"term\":\"heifer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02406392\"]}");
	add("{\"term\":\"height\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05138912\", \"05009517\", \"13963489\", \"05144430\"]}");
	add("{\"term\":\"heights\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08602145\"]}");
	add("{\"term\":\"heilong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09218981\"]}");
	add("{\"term\":\"heimdal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09603847\"]}");
	add("{\"term\":\"heimdall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09603847\"]}");
	add("{\"term\":\"heimdallr\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09603847\"]}");
	add("{\"term\":\"heinlein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11058501\"]}");
	add("{\"term\":\"heinousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04837574\"]}");
	add("{\"term\":\"heinz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11058653\"]}");
	add("{\"term\":\"heir\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10691052\", \"10188177\"]}");
	add("{\"term\":\"heiress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10188740\"]}");
	add("{\"term\":\"heirloom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13285587\", \"13285693\"]}");
	add("{\"term\":\"heisenberg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11058806\"]}");
	add("{\"term\":\"heist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00783566\", \"00784717\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }