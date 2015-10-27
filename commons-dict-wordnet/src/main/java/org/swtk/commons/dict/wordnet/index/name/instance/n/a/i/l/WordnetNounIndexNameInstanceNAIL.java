package org.swtk.commons.dict.wordnet.index.name.instance.n.a.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNAIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nail\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13673953\", \"03810284\", \"05589324\"]}");
	add("{\"term\":\"nailbrush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03810720\"]}");
	add("{\"term\":\"nailer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10363934\"]}");
	add("{\"term\":\"nailfile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03810820\"]}");
	add("{\"term\":\"nailhead\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03810914\", \"03811043\"]}");
	add("{\"term\":\"nailrod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12176290\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }