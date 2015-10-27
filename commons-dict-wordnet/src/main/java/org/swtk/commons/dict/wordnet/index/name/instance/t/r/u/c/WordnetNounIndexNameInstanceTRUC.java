package org.swtk.commons.dict.wordnet.index.name.instance.t.r.u.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRUC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"truce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13994359\"]}");
	add("{\"term\":\"truck\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03495220\", \"04497386\"]}");
	add("{\"term\":\"truckage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01107814\", \"13344907\"]}");
	add("{\"term\":\"trucker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10714688\"]}");
	add("{\"term\":\"trucking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01107814\"]}");
	add("{\"term\":\"truckle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04498933\"]}");
	add("{\"term\":\"truckler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09820054\"]}");
	add("{\"term\":\"truckling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01169875\"]}");
	add("{\"term\":\"truculence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04651518\"]}");
	add("{\"term\":\"truculency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04651518\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }