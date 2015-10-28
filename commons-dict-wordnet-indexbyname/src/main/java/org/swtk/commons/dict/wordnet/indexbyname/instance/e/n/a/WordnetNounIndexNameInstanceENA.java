package org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceENA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"enactment\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00549839\", \"06544086\", \"01129177\"]}");
	add("{\"term\":\"enalapril\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03290017\"]}");
	add("{\"term\":\"enallage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07117772\"]}");
	add("{\"term\":\"enamel\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03289654\", \"03289797\", \"15135021\", \"05316180\"]}");
	add("{\"term\":\"enamelware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03289892\"]}");
	add("{\"term\":\"enamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14907812\"]}");
	add("{\"term\":\"enamoredness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07559601\"]}");
	add("{\"term\":\"enanthem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14345080\"]}");
	add("{\"term\":\"enanthema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14345080\"]}");
	add("{\"term\":\"enantiomer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14907917\"]}");
	add("{\"term\":\"enantiomorph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14907917\"]}");
	add("{\"term\":\"enantiomorphism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13851621\"]}");
	add("{\"term\":\"enarthrosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05603286\"]}");
	add("{\"term\":\"enate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10256218\"]}");
	add("{\"term\":\"enation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13108856\", \"13836967\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }