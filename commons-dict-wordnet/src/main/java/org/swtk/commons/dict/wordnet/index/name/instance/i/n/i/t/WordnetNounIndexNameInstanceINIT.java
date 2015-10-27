package org.swtk.commons.dict.wordnet.index.name.instance.i.n.i.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINIT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"initial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06844047\"]}");
	add("{\"term\":\"initialisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06649875\"]}");
	add("{\"term\":\"initialism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07106112\", \"07106330\"]}");
	add("{\"term\":\"initialization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06649875\"]}");
	add("{\"term\":\"initiate\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07965104\", \"10226506\", \"10383612\"]}");
	add("{\"term\":\"initiation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00157210\", \"04897741\", \"00241051\", \"07467805\"]}");
	add("{\"term\":\"initiative\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00240097\", \"04843305\"]}");
	add("{\"term\":\"initiator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10228683\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }