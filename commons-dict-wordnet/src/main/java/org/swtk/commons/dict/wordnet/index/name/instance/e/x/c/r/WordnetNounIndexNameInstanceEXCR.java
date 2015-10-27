package org.swtk.commons.dict.wordnet.index.name.instance.e.x.c.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEXCR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"excrement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14878134\"]}");
	add("{\"term\":\"excrescence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05611405\", \"13917127\"]}");
	add("{\"term\":\"excreta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14878134\"]}");
	add("{\"term\":\"excreting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13494300\"]}");
	add("{\"term\":\"excretion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14878134\", \"13494300\"]}");
	add("{\"term\":\"excruciation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00423554\", \"14347683\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }