package org.swtk.commons.dict.wordnet.indexbyname.instance.t.w.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTWE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tweak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00358101\"]}");
	add("{\"term\":\"tweed\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03361927\", \"04509797\"]}");
	add("{\"term\":\"tweediness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04824251\", \"04955899\"]}");
	add("{\"term\":\"tweet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07413627\"]}");
	add("{\"term\":\"tweeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04509965\"]}");
	add("{\"term\":\"tweezer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03947960\"]}");
	add("{\"term\":\"twelfth\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13760599\", \"13870249\"]}");
	add("{\"term\":\"twelfthtide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15219695\"]}");
	add("{\"term\":\"twelve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13768925\"]}");
	add("{\"term\":\"twelvemonth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15228587\"]}");
	add("{\"term\":\"twenties\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15173827\", \"15173544\"]}");
	add("{\"term\":\"twentieth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13871081\"]}");
	add("{\"term\":\"twenty\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13416469\", \"13770268\"]}");
	add("{\"term\":\"twerp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10753786\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }