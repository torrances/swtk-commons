package org.swtk.commons.dict.wordnet.index.name.instance.b.e.n.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBEND {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bend\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"02833197\", \"09156059\", \"13930429\", \"02832880\", \"07325609\", \"13891966\"]}");
	add("{\"term\":\"bendability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05029875\"]}");
	add("{\"term\":\"bender\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00108695\", \"00512052\", \"02833341\"]}");
	add("{\"term\":\"bending\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00406027\", \"05018461\", \"07325609\"]}");
	add("{\"term\":\"bendopa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14629310\"]}");
	add("{\"term\":\"bends\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14091826\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }