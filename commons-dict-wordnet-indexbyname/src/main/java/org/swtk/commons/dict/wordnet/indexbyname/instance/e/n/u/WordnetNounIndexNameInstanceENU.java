package org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceENU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"enucleation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00672433\"]}");
	add("{\"term\":\"enuki\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09538847\"]}");
	add("{\"term\":\"enumeration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00635829\", \"06502878\"]}");
	add("{\"term\":\"enumerator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09923510\"]}");
	add("{\"term\":\"enunciation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07147123\"]}");
	add("{\"term\":\"enuresis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13496061\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }