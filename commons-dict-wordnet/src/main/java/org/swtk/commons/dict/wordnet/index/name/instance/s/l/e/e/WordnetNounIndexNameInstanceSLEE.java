package org.swtk.commons.dict.wordnet.index.name.instance.s.l.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSLEE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sleekness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04954671\", \"04957513\"]}");
	add("{\"term\":\"sleep\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"13986101\", \"15298612\", \"14049464\", \"14048353\"]}");
	add("{\"term\":\"sleeper\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00065190\", \"02622491\", \"04242752\", \"04242877\", \"04243107\", \"04440719\", \"10630215\", \"10630366\", \"10629981\"]}");
	add("{\"term\":\"sleepiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14053917\"]}");
	add("{\"term\":\"sleeping\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00859826\", \"01066787\", \"05688958\"]}");
	add("{\"term\":\"sleeplessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14046430\"]}");
	add("{\"term\":\"sleepover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07470594\"]}");
	add("{\"term\":\"sleepwalker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10630877\"]}");
	add("{\"term\":\"sleepwalking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00285985\"]}");
	add("{\"term\":\"sleepwear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03830620\"]}");
	add("{\"term\":\"sleepyhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10631057\"]}");
	add("{\"term\":\"sleet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11528369\"]}");
	add("{\"term\":\"sleeve\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04243808\", \"04243483\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }