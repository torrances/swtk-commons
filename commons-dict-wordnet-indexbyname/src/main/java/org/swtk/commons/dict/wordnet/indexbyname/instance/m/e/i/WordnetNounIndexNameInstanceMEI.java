package org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMEI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mei\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12661600\"]}");
	add("{\"term\":\"meiosis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07118958\", \"13533928\"]}");
	add("{\"term\":\"meir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11191288\"]}");
	add("{\"term\":\"meissner\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11191399\", \"11191503\"]}");
	add("{\"term\":\"meitner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11191604\"]}");
	add("{\"term\":\"meitnerium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14669141\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }