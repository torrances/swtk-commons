package org.swtk.commons.dict.wordnet.indexbyname.instance.p.y.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePYG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pygmalion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09577830\"]}");
	add("{\"term\":\"pygmy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10516074\", \"10516211\"]}");
	add("{\"term\":\"pygmy chimpanzee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02485281\"]}");
	add("{\"term\":\"pygmy cypress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11651856\"]}");
	add("{\"term\":\"pygmy marmoset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02493442\"]}");
	add("{\"term\":\"pygmy mouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02340250\"]}");
	add("{\"term\":\"pygmy sperm whale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02070256\"]}");
	add("{\"term\":\"pygopodidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01678605\"]}");
	add("{\"term\":\"pygopus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01678754\"]}");
	add("{\"term\":\"pygoscelis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02058745\"]}");
	add("{\"term\":\"pygoscelis adeliae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02058882\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }