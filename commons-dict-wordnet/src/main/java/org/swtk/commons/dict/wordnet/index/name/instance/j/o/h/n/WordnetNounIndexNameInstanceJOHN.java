package org.swtk.commons.dict.wordnet.index.name.instance.j.o.h.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJOHN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"john\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06453909\", \"10799671\", \"11105914\", \"11106269\", \"04453410\"]}");
	add("{\"term\":\"johnny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10647730\"]}");
	add("{\"term\":\"johnnycake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07704748\"]}");
	add("{\"term\":\"johns\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11107921\"]}");
	add("{\"term\":\"johnson\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11108049\", \"11108336\", \"11108612\"]}");
	add("{\"term\":\"johnston\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11108761\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }