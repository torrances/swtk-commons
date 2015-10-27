package org.swtk.commons.dict.wordnet.index.name.instance.r.e.s.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRESU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"result\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06344278\", \"07307418\", \"06756201\", \"11430739\"]}");
	add("{\"term\":\"resultant\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05873618\", \"07307418\", \"13964370\"]}");
	add("{\"term\":\"resume\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06480074\", \"06481365\"]}");
	add("{\"term\":\"resumption\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00242870\"]}");
	add("{\"term\":\"resurgence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01049262\"]}");
	add("{\"term\":\"resurrection\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01049983\", \"07326636\"]}");
	add("{\"term\":\"resurvey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00881209\"]}");
	add("{\"term\":\"resuscitation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01050134\"]}");
	add("{\"term\":\"resuscitator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04089456\"]}");
	add("{\"term\":\"resuspension\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14615661\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }