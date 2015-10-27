package org.swtk.commons.dict.wordnet.index.name.instance.s.c.u.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCUL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"scull\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04163781\", \"04163875\", \"04164007\"]}");
	add("{\"term\":\"sculler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10585192\"]}");
	add("{\"term\":\"scullery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04164160\"]}");
	add("{\"term\":\"sculling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00446670\"]}");
	add("{\"term\":\"scullion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10585379\"]}");
	add("{\"term\":\"sculpin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02647934\"]}");
	add("{\"term\":\"sculptor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09449372\", \"10585500\"]}");
	add("{\"term\":\"sculptress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10586321\"]}");
	add("{\"term\":\"sculpture\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00939472\", \"04164381\"]}");
	add("{\"term\":\"sculpturer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10585500\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }