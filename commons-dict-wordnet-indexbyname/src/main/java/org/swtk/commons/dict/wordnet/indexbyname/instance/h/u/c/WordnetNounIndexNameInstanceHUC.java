package org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHUC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"huck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03553375\"]}");
	add("{\"term\":\"huck finn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09626527\"]}");
	add("{\"term\":\"huckaback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03553375\"]}");
	add("{\"term\":\"huckleberry\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07759360\", \"12257063\", \"12267158\"]}");
	add("{\"term\":\"huckleberry finn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09626527\"]}");
	add("{\"term\":\"huckleberry oak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12299577\"]}");
	add("{\"term\":\"huckster\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10210263\", \"10210135\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }