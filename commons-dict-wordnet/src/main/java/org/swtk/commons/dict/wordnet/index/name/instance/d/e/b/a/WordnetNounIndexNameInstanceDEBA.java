package org.swtk.commons.dict.wordnet.index.name.instance.d.e.b.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEBA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"debacle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07491763\", \"11475370\", \"07380032\"]}");
	add("{\"term\":\"debarkation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00058822\"]}");
	add("{\"term\":\"debarment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01079805\", \"14451395\"]}");
	add("{\"term\":\"debasement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00272107\", \"14511027\"]}");
	add("{\"term\":\"debaser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10016750\"]}");
	add("{\"term\":\"debate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07256764\", \"07155686\"]}");
	add("{\"term\":\"debater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10016942\"]}");
	add("{\"term\":\"debauch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00512223\"]}");
	add("{\"term\":\"debauchee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10277344\"]}");
	add("{\"term\":\"debaucher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10773949\"]}");
	add("{\"term\":\"debauchery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00512223\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }