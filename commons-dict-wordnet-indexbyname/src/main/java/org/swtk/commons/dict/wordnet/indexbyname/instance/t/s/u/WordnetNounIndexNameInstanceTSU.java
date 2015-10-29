package org.swtk.commons.dict.wordnet.indexbyname.instance.t.s.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTSU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tsuga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11647479\"]}");
	add("{\"term\":\"tsuga canadensis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11647963\"]}");
	add("{\"term\":\"tsuga caroliniana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11648165\"]}");
	add("{\"term\":\"tsuga heterophylla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11648538\"]}");
	add("{\"term\":\"tsuga mertensiana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11648359\"]}");
	add("{\"term\":\"tsunami\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07363899\"]}");
	add("{\"term\":\"tsung dao lee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11144078\"]}");
	add("{\"term\":\"tsuris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00625525\"]}");
	add("{\"term\":\"tsushima\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01300653\"]}");
	add("{\"term\":\"tsutsugamushi disease\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14165808\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }