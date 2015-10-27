package org.swtk.commons.dict.wordnet.index.name.instance.c.r.a.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCRAF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"craft\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05628961\", \"05645908\", \"08453572\", \"03130521\", \"00607485\"]}");
	add("{\"term\":\"crafter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09994955\"]}");
	add("{\"term\":\"craftiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04883756\", \"05628961\"]}");
	add("{\"term\":\"craftsman\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09994178\", \"09994955\", \"09995160\"]}");
	add("{\"term\":\"craftsmanship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05645908\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }