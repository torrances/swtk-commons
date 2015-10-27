package org.swtk.commons.dict.wordnet.index.name.instance.a.c.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceACID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"acid\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02678511\", \"14631699\"]}");
	add("{\"term\":\"acidemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14044224\"]}");
	add("{\"term\":\"acidification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13447411\"]}");
	add("{\"term\":\"acidimetry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00649162\"]}");
	add("{\"term\":\"acidity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05046680\", \"05724908\", \"05001060\"]}");
	add("{\"term\":\"acidophil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01351974\"]}");
	add("{\"term\":\"acidophile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01351974\"]}");
	add("{\"term\":\"acidophilus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01382939\"]}");
	add("{\"term\":\"acidosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14043071\"]}");
	add("{\"term\":\"acidulousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05724908\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }