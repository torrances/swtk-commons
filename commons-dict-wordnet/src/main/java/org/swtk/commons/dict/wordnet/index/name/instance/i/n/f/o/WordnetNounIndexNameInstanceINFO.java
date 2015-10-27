package org.swtk.commons.dict.wordnet.index.name.instance.i.n.f.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINFO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"info\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06646883\"]}");
	add("{\"term\":\"infolding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13523144\"]}");
	add("{\"term\":\"infomercial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07264866\"]}");
	add("{\"term\":\"informality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04794222\", \"04919229\"]}");
	add("{\"term\":\"informant\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10805709\", \"10225604\"]}");
	add("{\"term\":\"informatics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06151569\"]}");
	add("{\"term\":\"information\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05098731\", \"08479331\", \"07252221\", \"05824413\", \"06646883\"]}");
	add("{\"term\":\"informer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10225792\"]}");
	add("{\"term\":\"informercial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07264866\"]}");
	add("{\"term\":\"informing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07226850\", \"07229654\"]}");
	add("{\"term\":\"infotainment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06629313\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }