package org.swtk.commons.dict.wordnet.index.name.instance.t.o.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"toast\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07900388\", \"10157456\", \"10733016\", \"07702618\"]}");
	add("{\"term\":\"toaster\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04449446\", \"10733151\"]}");
	add("{\"term\":\"toasting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00247419\"]}");
	add("{\"term\":\"toastmaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10733335\"]}");
	add("{\"term\":\"toastrack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04449875\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }