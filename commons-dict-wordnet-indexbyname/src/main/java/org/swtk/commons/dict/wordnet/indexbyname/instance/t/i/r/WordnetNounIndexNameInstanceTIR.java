package org.swtk.commons.dict.wordnet.indexbyname.instance.t.i.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTIR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tirade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07248075\"]}");
	add("{\"term\":\"tiramisu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07628875\"]}");
	add("{\"term\":\"tirana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08722905\"]}");
	add("{\"term\":\"tire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04447883\"]}");
	add("{\"term\":\"tiredness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14039832\"]}");
	add("{\"term\":\"tirelessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04872055\"]}");
	add("{\"term\":\"tiresias\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09621240\"]}");
	add("{\"term\":\"tiresomeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05213505\"]}");
	add("{\"term\":\"tiro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10383612\"]}");
	add("{\"term\":\"tirol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08865127\"]}");
	add("{\"term\":\"tirolean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04513183\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }