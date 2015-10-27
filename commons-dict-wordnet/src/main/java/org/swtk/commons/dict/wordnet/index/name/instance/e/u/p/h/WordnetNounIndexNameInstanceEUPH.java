package org.swtk.commons.dict.wordnet.index.name.instance.e.u.p.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEUPH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"euphagus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01577312\"]}");
	add("{\"term\":\"euphausiacea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01991122\"]}");
	add("{\"term\":\"euphemism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06617399\"]}");
	add("{\"term\":\"euphonium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03306513\"]}");
	add("{\"term\":\"euphony\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05726503\"]}");
	add("{\"term\":\"euphorbia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12938098\"]}");
	add("{\"term\":\"euphorbiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12937695\"]}");
	add("{\"term\":\"euphorbium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14876499\"]}");
	add("{\"term\":\"euphoria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07544484\"]}");
	add("{\"term\":\"euphoriant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03306641\"]}");
	add("{\"term\":\"euphory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07544484\"]}");
	add("{\"term\":\"euphractus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02458215\"]}");
	add("{\"term\":\"euphrates\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09297645\"]}");
	add("{\"term\":\"euphrosyne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09518863\"]}");
	add("{\"term\":\"euphuism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06378324\", \"07083557\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }