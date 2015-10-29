package org.swtk.commons.dict.wordnet.indexbyname.instance.o.e.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOED {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06432067\"]}");
	add("{\"term\":\"oedema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14340141\"]}");
	add("{\"term\":\"oedipal complex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07497922\"]}");
	add("{\"term\":\"oedipus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09620972\"]}");
	add("{\"term\":\"oedipus complex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07497922\"]}");
	add("{\"term\":\"oedipus rex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09620972\"]}");
	add("{\"term\":\"oedogoniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01414368\"]}");
	add("{\"term\":\"oedogoniales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01414197\"]}");
	add("{\"term\":\"oedogonium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01414512\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }