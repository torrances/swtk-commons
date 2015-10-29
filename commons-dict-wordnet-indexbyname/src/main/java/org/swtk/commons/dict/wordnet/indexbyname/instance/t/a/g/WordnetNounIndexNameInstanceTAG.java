package org.swtk.commons.dict.wordnet.indexbyname.instance.t.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tag\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00145844\", \"00488885\", \"04053034\", \"07288121\", \"07287841\"]}");
	add("{\"term\":\"tag end\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04053034\"]}");
	add("{\"term\":\"tag line\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06791616\"]}");
	add("{\"term\":\"tagalog\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06952763\", \"10707987\"]}");
	add("{\"term\":\"tagalong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10708167\"]}");
	add("{\"term\":\"tagamet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03035538\"]}");
	add("{\"term\":\"tagasaste\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12535097\"]}");
	add("{\"term\":\"tagetes erecta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12041205\"]}");
	add("{\"term\":\"tagetes patula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12041410\"]}");
	add("{\"term\":\"tageteste\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12040857\"]}");
	add("{\"term\":\"tagger\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06589761\", \"10708307\", \"10708471\"]}");
	add("{\"term\":\"tagging program\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06589761\"]}");
	add("{\"term\":\"tagliatelle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07717117\"]}");
	add("{\"term\":\"tagore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11349025\"]}");
	add("{\"term\":\"taguan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02365221\"]}");
	add("{\"term\":\"tagus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09476696\"]}");
	add("{\"term\":\"tagus river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09476696\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }