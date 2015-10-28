package org.swtk.commons.dict.wordnet.indexbyname.instance.a.f.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAFR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aframomum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12378319\"]}");
	add("{\"term\":\"afrasian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06999218\"]}");
	add("{\"term\":\"africa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09212308\"]}");
	add("{\"term\":\"african\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09657682\"]}");
	add("{\"term\":\"africander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02408698\"]}");
	add("{\"term\":\"afrikaans\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06965623\"]}");
	add("{\"term\":\"afrikander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09658823\"]}");
	add("{\"term\":\"afrikaner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09658823\"]}");
	add("{\"term\":\"afrl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02691754\"]}");
	add("{\"term\":\"afro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05266372\"]}");
	add("{\"term\":\"afroasiatic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06999218\"]}");
	add("{\"term\":\"afrocarpus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11673774\"]}");
	add("{\"term\":\"afropavo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01806282\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }