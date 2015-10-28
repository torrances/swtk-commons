package org.swtk.commons.dict.wordnet.indexbyname.instance.k.u.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKUR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09351054\"]}");
	add("{\"term\":\"kurakkan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12139178\"]}");
	add("{\"term\":\"kurchee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11793348\"]}");
	add("{\"term\":\"kurchi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11793348\"]}");
	add("{\"term\":\"kurd\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09738826\"]}");
	add("{\"term\":\"kurdish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06987218\"]}");
	add("{\"term\":\"kurdistan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03634391\", \"09061465\"]}");
	add("{\"term\":\"kurosawa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11132897\"]}");
	add("{\"term\":\"kuroshio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11510086\"]}");
	add("{\"term\":\"kurrajong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12217211\"]}");
	add("{\"term\":\"kurrat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12452861\"]}");
	add("{\"term\":\"kursk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09027981\"]}");
	add("{\"term\":\"kurta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03634522\"]}");
	add("{\"term\":\"kuru\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14132583\"]}");
	add("{\"term\":\"kurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13709383\"]}");
	add("{\"term\":\"kurux\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06995051\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }