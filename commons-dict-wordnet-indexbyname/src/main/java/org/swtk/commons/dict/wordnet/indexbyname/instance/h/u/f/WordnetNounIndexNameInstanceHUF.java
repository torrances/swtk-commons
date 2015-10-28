package org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHUF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"huff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14430474\"]}");
	add("{\"term\":\"huffiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07533108\"]}");
	add("{\"term\":\"huffing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00836121\"]}");
	add("{\"term\":\"huffishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07564867\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }