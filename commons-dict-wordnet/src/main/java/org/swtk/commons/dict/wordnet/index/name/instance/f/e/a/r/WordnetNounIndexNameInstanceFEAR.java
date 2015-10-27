package org.swtk.commons.dict.wordnet.index.name.instance.f.e.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFEAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fear\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07536278\", \"07539768\", \"07534492\"]}");
	add("{\"term\":\"fearfulness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04867817\", \"07534492\"]}");
	add("{\"term\":\"fearlessness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04865686\", \"07541421\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }