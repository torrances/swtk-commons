package org.swtk.commons.dict.wordnet.index.name.instance.c.o.r.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCORS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"corsage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02882329\"]}");
	add("{\"term\":\"corsair\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03117256\", \"09986471\"]}");
	add("{\"term\":\"corse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08961668\", \"08961864\"]}");
	add("{\"term\":\"corselet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03117370\"]}");
	add("{\"term\":\"corset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03117520\"]}");
	add("{\"term\":\"corsica\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08961668\", \"08961864\"]}");
	add("{\"term\":\"corslet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03117370\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }