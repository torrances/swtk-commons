package org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceENE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13854317\"]}");
	add("{\"term\":\"enea silvio piccolomini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11256842\"]}");
	add("{\"term\":\"enema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00697197\"]}");
	add("{\"term\":\"enemy\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"10118479\", \"07963437\", \"10075655\", \"08207412\"]}");
	add("{\"term\":\"energid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05439161\"]}");
	add("{\"term\":\"energiser\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03292262\", \"10075911\"]}");
	add("{\"term\":\"energizer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03292262\", \"10075911\"]}");
	add("{\"term\":\"energizing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01048908\"]}");
	add("{\"term\":\"energy\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"08149937\", \"11472496\", \"14073625\", \"04640554\", \"04843914\", \"05043116\", \"11472635\"]}");
	add("{\"term\":\"energy department\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08149937\"]}");
	add("{\"term\":\"energy level\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11473167\"]}");
	add("{\"term\":\"energy of activation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11441936\"]}");
	add("{\"term\":\"energy secretary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00602203\", \"10591114\"]}");
	add("{\"term\":\"energy state\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11473167\"]}");
	add("{\"term\":\"energy unit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13630750\"]}");
	add("{\"term\":\"enervation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00674737\", \"07345810\", \"05049025\"]}");
	add("{\"term\":\"enesco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10979066\"]}");
	add("{\"term\":\"enets\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06972672\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }