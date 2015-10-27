package org.swtk.commons.dict.wordnet.index.name.instance.e.v.e.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEVER {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"everest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09299916\"]}");
	add("{\"term\":\"everglades\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09300185\"]}");
	add("{\"term\":\"evergreen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13120592\"]}");
	add("{\"term\":\"everlasting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11936368\"]}");
	add("{\"term\":\"everlastingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05061577\"]}");
	add("{\"term\":\"evernia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13010852\"]}");
	add("{\"term\":\"evers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10983634\"]}");
	add("{\"term\":\"eversion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00336479\", \"05087823\"]}");
	add("{\"term\":\"evert\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10983807\"]}");
	add("{\"term\":\"everting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00336479\"]}");
	add("{\"term\":\"everydayness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04802794\"]}");
	add("{\"term\":\"everyman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10087600\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }