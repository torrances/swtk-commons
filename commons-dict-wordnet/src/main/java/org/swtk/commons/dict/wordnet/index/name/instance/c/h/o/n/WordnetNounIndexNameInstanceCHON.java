package org.swtk.commons.dict.wordnet.index.name.instance.c.h.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13731223\", \"13731591\"]}");
	add("{\"term\":\"chondrichthian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01483157\"]}");
	add("{\"term\":\"chondrichthyes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01482977\"]}");
	add("{\"term\":\"chondrin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14754981\"]}");
	add("{\"term\":\"chondriosome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05452965\"]}");
	add("{\"term\":\"chondrite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09267097\"]}");
	add("{\"term\":\"chondrodystrophy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14145286\"]}");
	add("{\"term\":\"chondroma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14259612\"]}");
	add("{\"term\":\"chondrosarcoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14263969\"]}");
	add("{\"term\":\"chondrule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09267237\"]}");
	add("{\"term\":\"chondrus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01417143\"]}");
	add("{\"term\":\"chongqing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08742994\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }