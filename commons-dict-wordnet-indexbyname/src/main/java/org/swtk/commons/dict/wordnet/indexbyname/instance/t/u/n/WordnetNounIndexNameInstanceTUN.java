package org.swtk.commons.dict.wordnet.indexbyname.instance.t.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04504737\"]}");
	add("{\"term\":\"tuna\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02529688\", \"02629392\", \"07796603\", \"11872617\"]}");
	add("{\"term\":\"tunaburger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07713153\"]}");
	add("{\"term\":\"tundra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09486356\"]}");
	add("{\"term\":\"tune\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01002785\", \"04994418\", \"07041860\"]}");
	add("{\"term\":\"tunefulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04991097\"]}");
	add("{\"term\":\"tuner\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04050813\", \"10752774\"]}");
	add("{\"term\":\"tung\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12948518\"]}");
	add("{\"term\":\"tunga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02190079\"]}");
	add("{\"term\":\"tungstate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15106524\"]}");
	add("{\"term\":\"tungsten\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14683691\"]}");
	add("{\"term\":\"tungus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06941387\", \"09756838\"]}");
	add("{\"term\":\"tungusic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06941207\", \"09756682\"]}");
	add("{\"term\":\"tunguska\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09220310\", \"09486492\", \"09486677\"]}");
	add("{\"term\":\"tunguz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06941387\"]}");
	add("{\"term\":\"tunic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04504865\", \"05614388\"]}");
	add("{\"term\":\"tunica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05614388\"]}");
	add("{\"term\":\"tunicata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01470627\"]}");
	add("{\"term\":\"tunicate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01470879\"]}");
	add("{\"term\":\"tuning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01001530\"]}");
	add("{\"term\":\"tunis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09060313\"]}");
	add("{\"term\":\"tunisia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09059869\"]}");
	add("{\"term\":\"tunisian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09754192\"]}");
	add("{\"term\":\"tunker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09697226\"]}");
	add("{\"term\":\"tunnage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13338291\"]}");
	add("{\"term\":\"tunnel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09252948\", \"04505257\"]}");
	add("{\"term\":\"tunney\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11371827\"]}");
	add("{\"term\":\"tunny\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02629392\", \"07796603\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }