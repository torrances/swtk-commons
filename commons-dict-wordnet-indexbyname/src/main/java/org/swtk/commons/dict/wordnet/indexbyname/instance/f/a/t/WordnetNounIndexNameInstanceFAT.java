package org.swtk.commons.dict.wordnet.indexbyname.instance.f.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fat\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05006566\", \"05276464\", \"14888511\"]}");
	add("{\"term\":\"fatah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08028255\"]}");
	add("{\"term\":\"fatalism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05980261\", \"06203765\"]}");
	add("{\"term\":\"fatalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10100277\"]}");
	add("{\"term\":\"fatality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04798531\", \"07347556\"]}");
	add("{\"term\":\"fatback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07687014\"]}");
	add("{\"term\":\"fate\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14496806\", \"09528047\", \"07344607\"]}");
	add("{\"term\":\"fathead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10177319\"]}");
	add("{\"term\":\"father\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"10045020\", \"10127072\", \"09560084\", \"10101225\", \"09941250\", \"10100973\", \"10122569\", \"10100638\"]}");
	add("{\"term\":\"fatherhood\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00593482\", \"00593561\", \"09560084\", \"13836110\"]}");
	add("{\"term\":\"fatherland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08527190\"]}");
	add("{\"term\":\"fatherliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04880500\"]}");
	add("{\"term\":\"fathom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13638589\", \"13682290\"]}");
	add("{\"term\":\"fathometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04267302\"]}");
	add("{\"term\":\"fatigability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05049166\"]}");
	add("{\"term\":\"fatigue\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00732006\", \"07555469\", \"14487260\", \"14039832\"]}");
	add("{\"term\":\"fatigues\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03329873\"]}");
	add("{\"term\":\"fatiha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06473672\"]}");
	add("{\"term\":\"fatihah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06473672\"]}");
	add("{\"term\":\"fatima\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10987439\"]}");
	add("{\"term\":\"fatimah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10987439\"]}");
	add("{\"term\":\"fatism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01157148\"]}");
	add("{\"term\":\"fatness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05006566\"]}");
	add("{\"term\":\"fatso\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10101915\"]}");
	add("{\"term\":\"fattiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05006906\"]}");
	add("{\"term\":\"fattism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01157148\"]}");
	add("{\"term\":\"fatty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10101915\"]}");
	add("{\"term\":\"fatuity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04898878\"]}");
	add("{\"term\":\"fatuousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04898878\"]}");
	add("{\"term\":\"fatwa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01194100\"]}");
	add("{\"term\":\"fatwah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06778447\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }