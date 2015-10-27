package org.swtk.commons.dict.wordnet.index.name.instance.x.y.l.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceXYLO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"xylocaine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03667342\"]}");
	add("{\"term\":\"xylocopa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02211882\"]}");
	add("{\"term\":\"xylol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15130710\"]}");
	add("{\"term\":\"xylomelum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12244467\"]}");
	add("{\"term\":\"xylophone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03726875\"]}");
	add("{\"term\":\"xylophonist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10821301\"]}");
	add("{\"term\":\"xylopia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11717245\"]}");
	add("{\"term\":\"xylose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15128347\"]}");
	add("{\"term\":\"xylosma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12401612\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }