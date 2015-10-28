package org.swtk.commons.dict.wordnet.indexbyname.instance.k.i.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKIS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kishar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09542043\"]}");
	add("{\"term\":\"kishinev\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09037220\"]}");
	add("{\"term\":\"kishke\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07894455\"]}");
	add("{\"term\":\"kislev\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15239636\"]}");
	add("{\"term\":\"kismat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07345160\"]}");
	add("{\"term\":\"kismet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07345160\"]}");
	add("{\"term\":\"kiss\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00138898\", \"07622373\", \"07652478\", \"00139041\"]}");
	add("{\"term\":\"kisser\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05609112\", \"10256893\"]}");
	add("{\"term\":\"kissimmee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09349045\"]}");
	add("{\"term\":\"kissing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00855630\"]}");
	add("{\"term\":\"kissinger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11126280\"]}");
	add("{\"term\":\"kisumu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08948515\"]}");
	add("{\"term\":\"kiswahili\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07006307\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }