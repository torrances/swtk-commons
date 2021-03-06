package org.swtk.commons.dict.wordnet.indexbyname.instance.k.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKNE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"knee\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03627907\", \"02466696\", \"05581233\"]}");
	add("{\"term\":\"knee bend\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00631311\"]}");
	add("{\"term\":\"knee brace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03628048\"]}");
	add("{\"term\":\"knee breeches\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02899704\"]}");
	add("{\"term\":\"knee jerk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00866537\"]}");
	add("{\"term\":\"knee joint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05581233\"]}");
	add("{\"term\":\"knee pad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03628407\"]}");
	add("{\"term\":\"knee pants\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02899704\"]}");
	add("{\"term\":\"knee piece\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03628547\"]}");
	add("{\"term\":\"kneecap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05285894\"]}");
	add("{\"term\":\"kneel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00337904\"]}");
	add("{\"term\":\"kneeler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03628282\", \"10257969\"]}");
	add("{\"term\":\"kneeling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00337904\"]}");
	add("{\"term\":\"kneepan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05285894\"]}");
	add("{\"term\":\"knell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07400794\"]}");
	add("{\"term\":\"knesset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08336609\"]}");
	add("{\"term\":\"knesseth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08336609\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }