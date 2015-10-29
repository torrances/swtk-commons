package org.swtk.commons.dict.wordnet.indexbyname.instance.s.m.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSMU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"smudge\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04701789\", \"07318884\"]}");
	add("{\"term\":\"smuggler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10634850\"]}");
	add("{\"term\":\"smuggling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01114037\"]}");
	add("{\"term\":\"smugness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07547386\"]}");
	add("{\"term\":\"smut\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00748513\", \"07139048\", \"13086889\", \"14307134\", \"14817703\"]}");
	add("{\"term\":\"smut fungus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13086889\"]}");
	add("{\"term\":\"smut grass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12161028\"]}");
	add("{\"term\":\"smuts\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11326614\"]}");
	add("{\"term\":\"smuttiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04910855\", \"14522556\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }