package org.swtk.commons.dict.wordnet.index.name.instance.t.r.a.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRAU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"traubel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11368042\"]}");
	add("{\"term\":\"trauma\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14308778\", \"14309164\"]}");
	add("{\"term\":\"traumatology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06074388\"]}");
	add("{\"term\":\"traumatophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14409324\"]}");
	add("{\"term\":\"trautvetteria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11759301\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }