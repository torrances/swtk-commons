package org.swtk.commons.dict.wordnet.index.name.instance.b.i.s.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBISE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bise\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11449470\"]}");
	add("{\"term\":\"bisection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00387258\"]}");
	add("{\"term\":\"bisexual\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09876413\"]}");
	add("{\"term\":\"bisexuality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00858789\", \"05015930\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }