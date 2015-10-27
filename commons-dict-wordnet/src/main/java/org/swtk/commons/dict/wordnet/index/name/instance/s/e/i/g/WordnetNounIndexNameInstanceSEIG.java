package org.swtk.commons.dict.wordnet.index.name.instance.s.e.i.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSEIG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"seigneur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10105505\"]}");
	add("{\"term\":\"seigneury\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00604981\", \"13273192\"]}");
	add("{\"term\":\"seignior\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10105505\"]}");
	add("{\"term\":\"seigniorage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13344670\"]}");
	add("{\"term\":\"seigniory\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00604981\", \"13273192\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }