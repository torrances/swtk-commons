package org.swtk.commons.dict.wordnet.index.name.instance.f.o.r.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFORT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fort\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03390857\", \"03425469\"]}");
	add("{\"term\":\"fortaz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02993140\"]}");
	add("{\"term\":\"forte\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03390266\", \"07059027\", \"05166608\"]}");
	add("{\"term\":\"forth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09307339\"]}");
	add("{\"term\":\"forthcomingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14054302\"]}");
	add("{\"term\":\"forthrightness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04878915\"]}");
	add("{\"term\":\"forties\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15174432\", \"15174311\"]}");
	add("{\"term\":\"fortieth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13871279\"]}");
	add("{\"term\":\"fortification\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00265372\", \"05643469\", \"03390403\"]}");
	add("{\"term\":\"fortissimo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07059160\"]}");
	add("{\"term\":\"fortitude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05039348\"]}");
	add("{\"term\":\"fortnight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15195378\"]}");
	add("{\"term\":\"fortran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06915138\"]}");
	add("{\"term\":\"fortress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03390857\"]}");
	add("{\"term\":\"fortuitousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04766235\"]}");
	add("{\"term\":\"fortuity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07315578\"]}");
	add("{\"term\":\"fortuna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09596583\"]}");
	add("{\"term\":\"fortune\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"14496806\", \"11438574\", \"13392111\", \"11438252\"]}");
	add("{\"term\":\"fortunella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12733580\"]}");
	add("{\"term\":\"fortuneteller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10125231\"]}");
	add("{\"term\":\"fortunetelling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06762182\"]}");
	add("{\"term\":\"forty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13771667\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }