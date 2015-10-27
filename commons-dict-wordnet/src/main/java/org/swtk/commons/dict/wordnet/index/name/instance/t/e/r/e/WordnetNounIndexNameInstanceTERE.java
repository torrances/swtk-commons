package org.swtk.commons.dict.wordnet.index.name.instance.t.e.r.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTERE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"terebella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01939875\"]}");
	add("{\"term\":\"terebellidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01939656\"]}");
	add("{\"term\":\"terebinth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12782665\"]}");
	add("{\"term\":\"teredinid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01969735\"]}");
	add("{\"term\":\"teredinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01969438\"]}");
	add("{\"term\":\"teredo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01969949\"]}");
	add("{\"term\":\"terence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11355690\"]}");
	add("{\"term\":\"terengganu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08985864\"]}");
	add("{\"term\":\"teres\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05598495\"]}");
	add("{\"term\":\"teresa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11355873\"]}");
	add("{\"term\":\"tereshkova\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11356359\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }