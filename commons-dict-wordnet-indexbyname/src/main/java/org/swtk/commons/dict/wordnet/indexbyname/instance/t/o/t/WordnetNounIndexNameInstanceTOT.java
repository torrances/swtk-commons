package org.swtk.commons.dict.wordnet.indexbyname.instance.t.o.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10734114\", \"13796106\"]}");
	add("{\"term\":\"total\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05869651\", \"04360881\"]}");
	add("{\"term\":\"total aphasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14121829\"]}");
	add("{\"term\":\"total darkness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14007292\"]}");
	add("{\"term\":\"total depravity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06201762\"]}");
	add("{\"term\":\"total eclipse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07383806\"]}");
	add("{\"term\":\"total heat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05019456\"]}");
	add("{\"term\":\"total hysterectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00678856\"]}");
	add("{\"term\":\"total parenteral nutrition\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01061369\"]}");
	add("{\"term\":\"totalisator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03896211\"]}");
	add("{\"term\":\"totaliser\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02682111\", \"03896211\"]}");
	add("{\"term\":\"totalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06223441\"]}");
	add("{\"term\":\"totalitarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10736986\"]}");
	add("{\"term\":\"totalitarian state\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08243048\"]}");
	add("{\"term\":\"totalitarianism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06223441\", \"08457622\"]}");
	add("{\"term\":\"totalitation regime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08243048\"]}");
	add("{\"term\":\"totality\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04360881\", \"04773106\", \"14484815\"]}");
	add("{\"term\":\"totalizator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03896211\"]}");
	add("{\"term\":\"totalizer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02682111\", \"03896211\"]}");
	add("{\"term\":\"totara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11673577\"]}");
	add("{\"term\":\"tote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02973867\"]}");
	add("{\"term\":\"tote bag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02973867\"]}");
	add("{\"term\":\"totem\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04465644\", \"08389501\"]}");
	add("{\"term\":\"totem pole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04465868\"]}");
	add("{\"term\":\"totemism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05963539\"]}");
	add("{\"term\":\"totemist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10737110\"]}");
	add("{\"term\":\"toter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09917148\"]}");
	add("{\"term\":\"totipotence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05222244\"]}");
	add("{\"term\":\"totipotency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05222244\"]}");
	add("{\"term\":\"totten trust\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13384538\"]}");
	add("{\"term\":\"totterer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10665293\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }