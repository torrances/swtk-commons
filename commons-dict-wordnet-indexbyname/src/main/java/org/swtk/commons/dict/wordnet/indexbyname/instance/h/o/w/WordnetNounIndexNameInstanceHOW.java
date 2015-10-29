package org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"howard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11082106\", \"11082280\"]}");
	add("{\"term\":\"howard carter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10904758\"]}");
	add("{\"term\":\"howard florey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10993489\"]}");
	add("{\"term\":\"howard hughes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11084829\"]}");
	add("{\"term\":\"howard lindsay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11153377\"]}");
	add("{\"term\":\"howard pyle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11269549\"]}");
	add("{\"term\":\"howard robard hughes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11084829\"]}");
	add("{\"term\":\"howdah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03552577\"]}");
	add("{\"term\":\"howdy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06645018\"]}");
	add("{\"term\":\"howe\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"11082419\", \"11082644\", \"11082796\", \"11082958\"]}");
	add("{\"term\":\"howells\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11083056\"]}");
	add("{\"term\":\"howitzer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03792248\"]}");
	add("{\"term\":\"howl\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07399967\", \"07400148\", \"07141442\"]}");
	add("{\"term\":\"howler\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00077143\", \"02495291\", \"06791764\"]}");
	add("{\"term\":\"howler monkey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02495291\"]}");
	add("{\"term\":\"howling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07141442\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }