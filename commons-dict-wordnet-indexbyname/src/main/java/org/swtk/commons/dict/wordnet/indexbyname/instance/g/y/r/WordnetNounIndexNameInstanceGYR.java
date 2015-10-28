package org.swtk.commons.dict.wordnet.indexbyname.instance.g.y.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGYR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gyration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00343581\", \"07455579\"]}");
	add("{\"term\":\"gyre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13898609\"]}");
	add("{\"term\":\"gyrfalcon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01614441\"]}");
	add("{\"term\":\"gyrinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02180028\"]}");
	add("{\"term\":\"gyro\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03478350\", \"07713995\"]}");
	add("{\"term\":\"gyrocompass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03478201\"]}");
	add("{\"term\":\"gyromitra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13058166\"]}");
	add("{\"term\":\"gyroplane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02762392\"]}");
	add("{\"term\":\"gyroscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03478350\"]}");
	add("{\"term\":\"gyrostabiliser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03478588\"]}");
	add("{\"term\":\"gyrostabilizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03478588\"]}");
	add("{\"term\":\"gyrus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05500078\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }