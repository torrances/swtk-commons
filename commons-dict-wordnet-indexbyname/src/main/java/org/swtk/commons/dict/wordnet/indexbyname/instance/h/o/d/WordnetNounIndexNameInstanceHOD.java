package org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03529467\"]}");
	add("{\"term\":\"hod carrier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10199158\"]}");
	add("{\"term\":\"hodeida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09187939\"]}");
	add("{\"term\":\"hoder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09604303\"]}");
	add("{\"term\":\"hodgepodge\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05962283\", \"08416934\"]}");
	add("{\"term\":\"hodgkin\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11073554\", \"11073812\", \"11074029\"]}");
	add("{\"term\":\"hodman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10199158\"]}");
	add("{\"term\":\"hodometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03846663\"]}");
	add("{\"term\":\"hodoscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03529605\"]}");
	add("{\"term\":\"hodr\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09604303\"]}");
	add("{\"term\":\"hodur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09604303\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }