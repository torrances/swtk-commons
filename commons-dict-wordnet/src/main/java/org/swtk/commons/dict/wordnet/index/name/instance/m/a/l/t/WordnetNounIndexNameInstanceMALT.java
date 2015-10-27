package org.swtk.commons.dict.wordnet.index.name.instance.m.a.l.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMALT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"malt\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07904884\", \"07905249\", \"07942882\"]}");
	add("{\"term\":\"malta\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08988590\", \"08988759\"]}");
	add("{\"term\":\"malted\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07942882\"]}");
	add("{\"term\":\"maltese\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02088588\", \"02126809\", \"07001573\", \"09766949\"]}");
	add("{\"term\":\"maltha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14704997\"]}");
	add("{\"term\":\"malthus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11172846\"]}");
	add("{\"term\":\"malthusian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10306446\"]}");
	add("{\"term\":\"malthusianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06004629\"]}");
	add("{\"term\":\"malti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07001573\"]}");
	add("{\"term\":\"maltman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10306552\"]}");
	add("{\"term\":\"malto\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06995147\", \"09694641\"]}");
	add("{\"term\":\"maltose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14970756\"]}");
	add("{\"term\":\"maltreater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09777974\"]}");
	add("{\"term\":\"maltreatment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00420921\"]}");
	add("{\"term\":\"maltster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10306552\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }