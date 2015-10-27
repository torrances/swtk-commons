package org.swtk.commons.dict.wordnet.index.name.instance.f.l.a.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFLAV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"flavin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14895075\"]}");
	add("{\"term\":\"flaviviridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01335294\"]}");
	add("{\"term\":\"flavivirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01335436\"]}");
	add("{\"term\":\"flavone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14893664\"]}");
	add("{\"term\":\"flavonoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14893809\"]}");
	add("{\"term\":\"flavor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05852809\", \"05723811\", \"14549784\"]}");
	add("{\"term\":\"flavorer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07825344\"]}");
	add("{\"term\":\"flavoring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07825344\"]}");
	add("{\"term\":\"flavorlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05004197\"]}");
	add("{\"term\":\"flavorsomeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05003105\"]}");
	add("{\"term\":\"flavour\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05723811\", \"05852809\", \"14549784\"]}");
	add("{\"term\":\"flavourer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07825344\"]}");
	add("{\"term\":\"flavouring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07825344\"]}");
	add("{\"term\":\"flavourlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05004197\"]}");
	add("{\"term\":\"flavoursomeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05003105\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }