package org.swtk.commons.dict.wordnet.index.name.instance.n.a.v.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNAVI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"navicular\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05279775\"]}");
	add("{\"term\":\"navigability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04726937\"]}");
	add("{\"term\":\"navigation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00315295\", \"01107642\", \"00817462\"]}");
	add("{\"term\":\"navigator\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10367614\", \"10368096\", \"10565985\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }