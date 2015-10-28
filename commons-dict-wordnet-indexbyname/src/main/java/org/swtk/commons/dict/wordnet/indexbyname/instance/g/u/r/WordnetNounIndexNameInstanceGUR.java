package org.swtk.commons.dict.wordnet.indexbyname.instance.g.u.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGUR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07008820\"]}");
	add("{\"term\":\"gurgle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07399341\"]}");
	add("{\"term\":\"gurkha\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09743648\", \"09743779\"]}");
	add("{\"term\":\"gurnard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02652680\"]}");
	add("{\"term\":\"gurney\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03476071\"]}");
	add("{\"term\":\"guru\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10172283\", \"10172409\", \"10172136\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }