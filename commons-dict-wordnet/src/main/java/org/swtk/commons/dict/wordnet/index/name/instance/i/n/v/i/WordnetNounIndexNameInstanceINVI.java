package org.swtk.commons.dict.wordnet.index.name.instance.i.n.v.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINVI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"invidia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00759688\"]}");
	add("{\"term\":\"invigilation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01138116\"]}");
	add("{\"term\":\"invigilator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10236073\"]}");
	add("{\"term\":\"invigoration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01050390\", \"04639057\"]}");
	add("{\"term\":\"invigorator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09425579\"]}");
	add("{\"term\":\"invincibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05039183\"]}");
	add("{\"term\":\"invirase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04300746\"]}");
	add("{\"term\":\"invisibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05025075\"]}");
	add("{\"term\":\"invisibleness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05025075\"]}");
	add("{\"term\":\"invitation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04696397\", \"07200808\"]}");
	add("{\"term\":\"invite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07201321\"]}");
	add("{\"term\":\"invitee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10170460\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }