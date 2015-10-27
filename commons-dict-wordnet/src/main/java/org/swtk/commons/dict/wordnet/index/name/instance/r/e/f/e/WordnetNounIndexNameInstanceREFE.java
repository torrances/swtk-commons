package org.swtk.commons.dict.wordnet.index.name.instance.r.e.f.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREFE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"refection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07589991\"]}");
	add("{\"term\":\"refectory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04074930\"]}");
	add("{\"term\":\"referee\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10534236\", \"10546502\", \"10534022\"]}");
	add("{\"term\":\"refereeing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01194245\"]}");
	add("{\"term\":\"reference\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"05931946\", \"06367922\", \"07273332\", \"01266543\", \"05931581\", \"06707541\", \"06429241\", \"07273000\", \"06776392\", \"06778981\"]}");
	add("{\"term\":\"referendum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00182489\"]}");
	add("{\"term\":\"referent\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06615483\", \"06615595\", \"06615847\"]}");
	add("{\"term\":\"referral\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00122724\", \"06684785\", \"10533848\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }