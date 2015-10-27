package org.swtk.commons.dict.wordnet.index.name.instance.s.e.p.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSEPT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sept\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07987168\", \"15237535\"]}");
	add("{\"term\":\"septation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00399393\"]}");
	add("{\"term\":\"septectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00688725\"]}");
	add("{\"term\":\"september\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15237535\"]}");
	add("{\"term\":\"septenary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13767056\"]}");
	add("{\"term\":\"septet\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"07055769\", \"08004236\", \"08004932\", \"08264856\", \"13767056\"]}");
	add("{\"term\":\"septette\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07055769\", \"08004236\", \"08004932\", \"08264856\"]}");
	add("{\"term\":\"septicaemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14213319\"]}");
	add("{\"term\":\"septicemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14213319\"]}");
	add("{\"term\":\"septillion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13775725\"]}");
	add("{\"term\":\"septobasidiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13090108\"]}");
	add("{\"term\":\"septobasidium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13090295\"]}");
	add("{\"term\":\"septuagenarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10599889\"]}");
	add("{\"term\":\"septuagesima\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15217107\"]}");
	add("{\"term\":\"septuagint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06460067\"]}");
	add("{\"term\":\"septum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11703912\", \"05230233\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }