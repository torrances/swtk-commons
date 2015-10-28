package org.swtk.commons.dict.wordnet.indexbyname.instance.e.s.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceESP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"esp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07271363\"]}");
	add("{\"term\":\"espadrille\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03302032\"]}");
	add("{\"term\":\"espagnole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07852245\"]}");
	add("{\"term\":\"espalier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03302155\"]}");
	add("{\"term\":\"espana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09045691\"]}");
	add("{\"term\":\"esparcet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12572814\"]}");
	add("{\"term\":\"esperantido\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06908705\"]}");
	add("{\"term\":\"esperanto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06908812\"]}");
	add("{\"term\":\"espial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00151907\"]}");
	add("{\"term\":\"espionage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00655806\"]}");
	add("{\"term\":\"esplanade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03302283\"]}");
	add("{\"term\":\"espoo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08798134\"]}");
	add("{\"term\":\"espousal\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00181262\", \"01038810\", \"01039501\"]}");
	add("{\"term\":\"espresso\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07936292\"]}");
	add("{\"term\":\"esprit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04641073\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }