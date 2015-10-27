package org.swtk.commons.dict.wordnet.index.name.instance.p.u.c.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePUCK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"puck\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04025935\", \"09564920\"]}");
	add("{\"term\":\"pucker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13930861\"]}");
	add("{\"term\":\"puckerbush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11762044\"]}");
	add("{\"term\":\"puckishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04657367\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }