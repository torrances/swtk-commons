package org.swtk.commons.dict.wordnet.index.name.instance.d.e.m.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEMU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"demulcent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03179495\"]}");
	add("{\"term\":\"demulen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03179657\"]}");
	add("{\"term\":\"demur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07223749\"]}");
	add("{\"term\":\"demureness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04795387\", \"04907413\"]}");
	add("{\"term\":\"demurrage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01068469\", \"13345449\"]}");
	add("{\"term\":\"demurral\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07223749\"]}");
	add("{\"term\":\"demurrer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01201240\", \"06574793\", \"07223749\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }