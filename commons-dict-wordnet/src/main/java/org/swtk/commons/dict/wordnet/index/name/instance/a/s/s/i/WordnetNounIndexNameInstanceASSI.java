package org.swtk.commons.dict.wordnet.index.name.instance.a.s.s.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceASSI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"assibilation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07143910\", \"13455579\"]}");
	add("{\"term\":\"assiduity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04872733\"]}");
	add("{\"term\":\"assiduousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04872733\"]}");
	add("{\"term\":\"assignation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01085569\", \"01234000\"]}");
	add("{\"term\":\"assignee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09834860\"]}");
	add("{\"term\":\"assigning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00165166\"]}");
	add("{\"term\":\"assignment\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00164600\", \"00798247\", \"13275136\", \"00165166\", \"06557519\", \"00731545\"]}");
	add("{\"term\":\"assignor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09835082\"]}");
	add("{\"term\":\"assimilation\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"05763711\", \"05765046\", \"13455710\", \"13455861\", \"13456051\", \"13953961\"]}");
	add("{\"term\":\"assimilator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10271476\"]}");
	add("{\"term\":\"assist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00559045\", \"01210099\"]}");
	add("{\"term\":\"assistance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13286803\", \"05162155\", \"01210099\"]}");
	add("{\"term\":\"assistant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09835195\"]}");
	add("{\"term\":\"assize\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06565463\", \"06677098\"]}");
	add("{\"term\":\"assizes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08347770\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }