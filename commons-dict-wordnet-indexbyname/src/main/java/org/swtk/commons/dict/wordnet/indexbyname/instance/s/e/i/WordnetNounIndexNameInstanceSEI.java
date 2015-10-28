package org.swtk.commons.dict.wordnet.indexbyname.instance.s.e.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSEI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"seiche\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07360795\"]}");
	add("{\"term\":\"seidel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04175533\"]}");
	add("{\"term\":\"seigneur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10105505\"]}");
	add("{\"term\":\"seigneury\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00604981\", \"13273192\"]}");
	add("{\"term\":\"seignior\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10105505\"]}");
	add("{\"term\":\"seigniorage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13344670\"]}");
	add("{\"term\":\"seigniory\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00604981\", \"13273192\"]}");
	add("{\"term\":\"seine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04175602\", \"09452656\"]}");
	add("{\"term\":\"seism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07443554\"]}");
	add("{\"term\":\"seismogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04175777\"]}");
	add("{\"term\":\"seismograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04175901\"]}");
	add("{\"term\":\"seismography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00605110\"]}");
	add("{\"term\":\"seismologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10595965\"]}");
	add("{\"term\":\"seismology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06130103\"]}");
	add("{\"term\":\"seismosaur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01714137\"]}");
	add("{\"term\":\"seismosaurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01713938\"]}");
	add("{\"term\":\"seiurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01572753\"]}");
	add("{\"term\":\"seizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10605673\"]}");
	add("{\"term\":\"seizing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00813935\", \"04176096\"]}");
	add("{\"term\":\"seizure\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00086039\", \"00776783\", \"00089301\", \"14105423\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }