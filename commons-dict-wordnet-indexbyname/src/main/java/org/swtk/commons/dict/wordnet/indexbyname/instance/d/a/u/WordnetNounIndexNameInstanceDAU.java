package org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDAU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"daub\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03169198\", \"04701789\", \"14852853\"]}");
	add("{\"term\":\"daubentonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02500614\"]}");
	add("{\"term\":\"daubentoniidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02500463\"]}");
	add("{\"term\":\"dauber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10012284\"]}");
	add("{\"term\":\"daubing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00720067\"]}");
	add("{\"term\":\"daucus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12957759\"]}");
	add("{\"term\":\"daugavpils\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09036094\"]}");
	add("{\"term\":\"daughter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10012375\"]}");
	add("{\"term\":\"daumier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10943273\"]}");
	add("{\"term\":\"dauntlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04865320\"]}");
	add("{\"term\":\"dauphin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10012660\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }