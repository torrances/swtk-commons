package org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.z;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGAZ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gaza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08812218\"]}");
	add("{\"term\":\"gaza strip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08812218\"]}");
	add("{\"term\":\"gazania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11991717\"]}");
	add("{\"term\":\"gazania rigens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11991875\"]}");
	add("{\"term\":\"gaze\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00880326\"]}");
	add("{\"term\":\"gazebo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03435328\"]}");
	add("{\"term\":\"gazella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02425506\"]}");
	add("{\"term\":\"gazella subgutturosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02426008\"]}");
	add("{\"term\":\"gazella thomsoni\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02425864\"]}");
	add("{\"term\":\"gazelle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02425668\"]}");
	add("{\"term\":\"gazelle hound\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02094483\"]}");
	add("{\"term\":\"gazette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06278308\"]}");
	add("{\"term\":\"gazetteer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06431271\", \"10142302\"]}");
	add("{\"term\":\"gazillion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13798632\"]}");
	add("{\"term\":\"gazpacho\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07601329\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }