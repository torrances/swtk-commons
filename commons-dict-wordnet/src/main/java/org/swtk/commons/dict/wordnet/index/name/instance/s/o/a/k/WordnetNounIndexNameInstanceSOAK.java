package org.swtk.commons.dict.wordnet.index.name.instance.s.o.a.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSOAK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"soak\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00257368\", \"13578361\"]}");
	add("{\"term\":\"soakage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13578361\"]}");
	add("{\"term\":\"soaker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09801608\", \"11522520\"]}");
	add("{\"term\":\"soaking\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00257368\", \"00278655\", \"13578361\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }