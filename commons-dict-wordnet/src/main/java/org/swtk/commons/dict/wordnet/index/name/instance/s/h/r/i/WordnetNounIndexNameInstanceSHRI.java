package org.swtk.commons.dict.wordnet.index.name.instance.s.h.r.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHRI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"shriek\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07407761\", \"07137720\"]}");
	add("{\"term\":\"shrieking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07407761\", \"07137720\"]}");
	add("{\"term\":\"shrift\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01041592\"]}");
	add("{\"term\":\"shrike\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01601229\"]}");
	add("{\"term\":\"shrilling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07408189\"]}");
	add("{\"term\":\"shrillness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04997257\", \"05200889\"]}");
	add("{\"term\":\"shrimp\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01989447\", \"07810135\", \"10563101\"]}");
	add("{\"term\":\"shrimper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04217355\"]}");
	add("{\"term\":\"shrimpfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01460048\"]}");
	add("{\"term\":\"shrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04217457\"]}");
	add("{\"term\":\"shrink\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10507601\"]}");
	add("{\"term\":\"shrinkage\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00783134\", \"05119515\", \"07327604\"]}");
	add("{\"term\":\"shrinking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00361311\", \"07327604\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }