package org.swtk.commons.dict.wordnet.index.name.instance.l.a.s.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLASS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10267055\"]}");
	add("{\"term\":\"lassa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08927150\"]}");
	add("{\"term\":\"lassie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10267055\"]}");
	add("{\"term\":\"lassitude\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05049292\", \"07499249\", \"14038461\"]}");
	add("{\"term\":\"lasso\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03649692\", \"11138352\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }