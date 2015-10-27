package org.swtk.commons.dict.wordnet.index.name.instance.r.o.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceROAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"road\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00174852\", \"04103160\"]}");
	add("{\"term\":\"roadbed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04103827\"]}");
	add("{\"term\":\"roadblock\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04103942\", \"05698721\"]}");
	add("{\"term\":\"roadbook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06434733\"]}");
	add("{\"term\":\"roadhog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10553337\"]}");
	add("{\"term\":\"roadhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04104179\"]}");
	add("{\"term\":\"roadkill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01761650\"]}");
	add("{\"term\":\"roadman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10553431\", \"10746438\"]}");
	add("{\"term\":\"roadrunner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01826676\"]}");
	add("{\"term\":\"roads\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08657875\"]}");
	add("{\"term\":\"roadside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04572519\"]}");
	add("{\"term\":\"roadstead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08657875\"]}");
	add("{\"term\":\"roadster\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02915903\", \"04104467\"]}");
	add("{\"term\":\"roadway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04104716\"]}");
	add("{\"term\":\"roadworthiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04814878\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }