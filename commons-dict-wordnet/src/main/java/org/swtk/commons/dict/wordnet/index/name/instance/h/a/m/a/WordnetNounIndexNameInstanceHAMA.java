package org.swtk.commons.dict.wordnet.index.name.instance.h.a.m.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHAMA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hamadryad\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01751547\", \"09574389\"]}");
	add("{\"term\":\"hamamelidaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12334832\"]}");
	add("{\"term\":\"hamamelidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12333522\"]}");
	add("{\"term\":\"hamamelidanthum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12334252\"]}");
	add("{\"term\":\"hamamelidoxylon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12334471\"]}");
	add("{\"term\":\"hamamelis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12335169\"]}");
	add("{\"term\":\"hamamelites\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12334663\"]}");
	add("{\"term\":\"haman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10177912\"]}");
	add("{\"term\":\"hamartia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14486915\"]}");
	add("{\"term\":\"hamartoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14262435\"]}");
	add("{\"term\":\"hamas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08039012\"]}");
	add("{\"term\":\"hamate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05280907\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }