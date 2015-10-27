package org.swtk.commons.dict.wordnet.index.name.instance.p.u.s.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePUSS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"puss\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02124950\", \"05529165\"]}");
	add("{\"term\":\"pussley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11878546\"]}");
	add("{\"term\":\"pussly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11878546\"]}");
	add("{\"term\":\"pussy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02124950\", \"05529165\"]}");
	add("{\"term\":\"pussycat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02124950\", \"10515560\"]}");
	add("{\"term\":\"pussytoes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11942843\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }