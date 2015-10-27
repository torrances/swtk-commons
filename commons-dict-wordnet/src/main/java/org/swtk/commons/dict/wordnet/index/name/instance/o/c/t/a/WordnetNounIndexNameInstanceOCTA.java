package org.swtk.commons.dict.wordnet.index.name.instance.o.c.t.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOCTA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"octad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13767226\"]}");
	add("{\"term\":\"octagon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13905220\"]}");
	add("{\"term\":\"octahedron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13938627\"]}");
	add("{\"term\":\"octameter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07110996\"]}");
	add("{\"term\":\"octane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14990918\"]}");
	add("{\"term\":\"octans\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09399778\"]}");
	add("{\"term\":\"octant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03846343\"]}");
	add("{\"term\":\"octave\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06394566\", \"06872451\", \"15321501\"]}");
	add("{\"term\":\"octavian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10848594\"]}");
	add("{\"term\":\"octavo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05103670\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }