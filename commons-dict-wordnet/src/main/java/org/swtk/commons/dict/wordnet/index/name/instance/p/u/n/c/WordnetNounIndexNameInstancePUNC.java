package org.swtk.commons.dict.wordnet.index.name.instance.p.u.n.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePUNC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"punch\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04029643\", \"07946794\", \"00135600\"]}");
	add("{\"term\":\"punchayet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08328452\"]}");
	add("{\"term\":\"punchball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04030356\"]}");
	add("{\"term\":\"punchboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04029816\"]}");
	add("{\"term\":\"puncher\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04029643\", \"10512212\", \"09992191\"]}");
	add("{\"term\":\"punctilio\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01207113\", \"06679474\"]}");
	add("{\"term\":\"punctiliousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04679962\"]}");
	add("{\"term\":\"punctuality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05054929\"]}");
	add("{\"term\":\"punctuation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00391006\", \"06854415\", \"07382730\"]}");
	add("{\"term\":\"punctum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05286421\"]}");
	add("{\"term\":\"puncture\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00944804\", \"04030790\", \"07329258\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }