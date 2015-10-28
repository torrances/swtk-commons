package org.swtk.commons.dict.wordnet.indexbyname.instance.z.o.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceZOR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"zori\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04034182\"]}");
	add("{\"term\":\"zoril\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02447015\"]}");
	add("{\"term\":\"zoroaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11427710\"]}");
	add("{\"term\":\"zoroastrian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09705524\"]}");
	add("{\"term\":\"zoroastrianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06254279\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }