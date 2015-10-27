package org.swtk.commons.dict.wordnet.index.name.instance.s.u.n.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSUND {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sundacarpus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11679951\"]}");
	add("{\"term\":\"sundae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07632096\"]}");
	add("{\"term\":\"sundanese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06952319\"]}");
	add("{\"term\":\"sunday\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11345529\", \"15188844\"]}");
	add("{\"term\":\"sunderland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08900940\"]}");
	add("{\"term\":\"sundew\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12803290\"]}");
	add("{\"term\":\"sundial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04362416\"]}");
	add("{\"term\":\"sundog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11508132\"]}");
	add("{\"term\":\"sundown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15194295\"]}");
	add("{\"term\":\"sundowner\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07929321\", \"10694581\"]}");
	add("{\"term\":\"sundress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04362589\"]}");
	add("{\"term\":\"sundries\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04362762\"]}");
	add("{\"term\":\"sundrops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12365217\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }