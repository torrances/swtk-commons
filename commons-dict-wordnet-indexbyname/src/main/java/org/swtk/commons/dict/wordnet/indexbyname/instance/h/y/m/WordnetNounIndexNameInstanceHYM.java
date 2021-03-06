package org.swtk.commons.dict.wordnet.indexbyname.instance.h.y.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHYM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hyman george rickover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11281976\"]}");
	add("{\"term\":\"hyman rickover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11281976\"]}");
	add("{\"term\":\"hymen\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05529585\", \"09587500\"]}");
	add("{\"term\":\"hymenaea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11770828\"]}");
	add("{\"term\":\"hymenaea courbaril\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11770977\"]}");
	add("{\"term\":\"hymenanthera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12411628\"]}");
	add("{\"term\":\"hymeneal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07050445\"]}");
	add("{\"term\":\"hymeneals\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07466684\"]}");
	add("{\"term\":\"hymenium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11570925\"]}");
	add("{\"term\":\"hymenogastrales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12991632\"]}");
	add("{\"term\":\"hymenomycetes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13018890\"]}");
	add("{\"term\":\"hymenophyllaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12972225\"]}");
	add("{\"term\":\"hymenophyllum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12972428\"]}");
	add("{\"term\":\"hymenopter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02208922\"]}");
	add("{\"term\":\"hymenoptera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02208548\"]}");
	add("{\"term\":\"hymenopteran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02208922\"]}");
	add("{\"term\":\"hymenopteron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02208922\"]}");
	add("{\"term\":\"hymenopterous insect\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02208922\"]}");
	add("{\"term\":\"hymenoxys acaulis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12045689\"]}");
	add("{\"term\":\"hymenoxys grandiflora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12045976\"]}");
	add("{\"term\":\"hymie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09701518\"]}");
	add("{\"term\":\"hymn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07049616\"]}");
	add("{\"term\":\"hymnal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06429901\"]}");
	add("{\"term\":\"hymnary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06429901\"]}");
	add("{\"term\":\"hymnbook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06429901\"]}");
	add("{\"term\":\"hymnody\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01258136\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }