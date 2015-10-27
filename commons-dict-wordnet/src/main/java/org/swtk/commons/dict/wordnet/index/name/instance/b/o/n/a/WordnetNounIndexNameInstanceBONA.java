package org.swtk.commons.dict.wordnet.index.name.instance.b.o.n.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBONA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bonaire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08766750\"]}");
	add("{\"term\":\"bonanza\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07492727\", \"09249405\"]}");
	add("{\"term\":\"bonaparte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11220266\"]}");
	add("{\"term\":\"bonasa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01800408\"]}");
	add("{\"term\":\"bonavist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12558074\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }