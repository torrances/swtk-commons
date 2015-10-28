package org.swtk.commons.dict.wordnet.indexbyname.instance.p.e.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePES {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05570899\"]}");
	add("{\"term\":\"pesach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15220763\"]}");
	add("{\"term\":\"pesah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15220763\"]}");
	add("{\"term\":\"pesantran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08300787\"]}");
	add("{\"term\":\"pesantren\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08300787\"]}");
	add("{\"term\":\"peseta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13712863\"]}");
	add("{\"term\":\"pesewa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13689255\"]}");
	add("{\"term\":\"peshawar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08999897\"]}");
	add("{\"term\":\"peshmerga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10437033\"]}");
	add("{\"term\":\"peso\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"13713614\", \"13713869\", \"13714119\", \"13714383\", \"13714664\", \"13714927\", \"13715189\", \"13715454\"]}");
	add("{\"term\":\"pessary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03194145\"]}");
	add("{\"term\":\"pessimism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05219242\", \"07558421\"]}");
	add("{\"term\":\"pessimist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10439217\"]}");
	add("{\"term\":\"pest\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01316879\", \"10439375\", \"14099961\", \"14162173\"]}");
	add("{\"term\":\"pesterer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10439375\"]}");
	add("{\"term\":\"pesthole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08636825\"]}");
	add("{\"term\":\"pesthouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03656129\"]}");
	add("{\"term\":\"pesticide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15004774\"]}");
	add("{\"term\":\"pestilence\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05701634\", \"14099961\", \"14162173\"]}");
	add("{\"term\":\"pestis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14162173\"]}");
	add("{\"term\":\"pestle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03925411\", \"03925552\", \"04307218\"]}");
	add("{\"term\":\"pesto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07848392\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }