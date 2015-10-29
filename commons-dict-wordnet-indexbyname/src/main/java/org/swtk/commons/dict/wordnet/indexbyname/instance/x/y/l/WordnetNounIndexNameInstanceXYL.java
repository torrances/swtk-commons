package org.swtk.commons.dict.wordnet.indexbyname.instance.x.y.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceXYL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"xylaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12987341\"]}");
	add("{\"term\":\"xylaria mali\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12987564\"]}");
	add("{\"term\":\"xylaria polymorpha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12987705\"]}");
	add("{\"term\":\"xylariaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12987146\"]}");
	add("{\"term\":\"xylem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13119407\"]}");
	add("{\"term\":\"xylene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15130710\"]}");
	add("{\"term\":\"xylocaine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03667342\"]}");
	add("{\"term\":\"xylocopa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02211882\"]}");
	add("{\"term\":\"xylol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15130710\"]}");
	add("{\"term\":\"xylomelum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12244467\"]}");
	add("{\"term\":\"xylomelum pyriforme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12244657\"]}");
	add("{\"term\":\"xylophone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03726875\"]}");
	add("{\"term\":\"xylophonist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10821301\"]}");
	add("{\"term\":\"xylopia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11717245\"]}");
	add("{\"term\":\"xylopia aethiopica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11717404\"]}");
	add("{\"term\":\"xylose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15128347\"]}");
	add("{\"term\":\"xylosma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12401612\"]}");
	add("{\"term\":\"xylosma congestum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12401612\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }