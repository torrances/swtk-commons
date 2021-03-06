package org.swtk.commons.dict.wordnet.indexbyname.instance.s.e.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSES {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sesame\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12895543\"]}");
	add("{\"term\":\"sesame family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12895189\"]}");
	add("{\"term\":\"sesame oil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07690901\"]}");
	add("{\"term\":\"sesame seed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07843386\"]}");
	add("{\"term\":\"sesamoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05288011\"]}");
	add("{\"term\":\"sesamoid bone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05288011\"]}");
	add("{\"term\":\"sesamum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12895402\"]}");
	add("{\"term\":\"sesamum indicum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12895543\"]}");
	add("{\"term\":\"sesbania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12589931\"]}");
	add("{\"term\":\"sesbania exaltata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12590121\"]}");
	add("{\"term\":\"sesbania grandiflora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12590356\"]}");
	add("{\"term\":\"seseli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12964998\"]}");
	add("{\"term\":\"sesotho\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07008186\"]}");
	add("{\"term\":\"sesquicentennial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15276300\"]}");
	add("{\"term\":\"sesquipedalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06316464\"]}");
	add("{\"term\":\"sesquipedalian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06316464\"]}");
	add("{\"term\":\"sesquipedality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07102132\"]}");
	add("{\"term\":\"sess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03997192\"]}");
	add("{\"term\":\"sessile polyp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14258349\"]}");
	add("{\"term\":\"sessile trillium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12489662\"]}");
	add("{\"term\":\"session\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08434877\", \"01234656\", \"15250045\", \"07160216\"]}");
	add("{\"term\":\"session cookie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06399370\"]}");
	add("{\"term\":\"sessions\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11313795\"]}");
	add("{\"term\":\"sestet\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06394659\", \"07055648\", \"08004811\", \"08264737\", \"13766862\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }