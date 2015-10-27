package org.swtk.commons.dict.wordnet.index.name.instance.s.o.n.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSONO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sonogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04267474\"]}");
	add("{\"term\":\"sonograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04267699\"]}");
	add("{\"term\":\"sonography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00903487\"]}");
	add("{\"term\":\"sonometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02760342\"]}");
	add("{\"term\":\"sonora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01738897\"]}");
	add("{\"term\":\"sonority\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04996893\"]}");
	add("{\"term\":\"sonorousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04996893\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }