package org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNOM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"noma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14236526\"]}");
	add("{\"term\":\"nomad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10379458\"]}");
	add("{\"term\":\"nombril\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08628896\"]}");
	add("{\"term\":\"nome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09078518\"]}");
	add("{\"term\":\"nomenclature\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06315049\"]}");
	add("{\"term\":\"nomenklatura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01156578\"]}");
	add("{\"term\":\"nomia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02213219\"]}");
	add("{\"term\":\"nominal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06327473\"]}");
	add("{\"term\":\"nominalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05983023\"]}");
	add("{\"term\":\"nominalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10379687\"]}");
	add("{\"term\":\"nomination\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07255585\", \"13949568\", \"00164973\"]}");
	add("{\"term\":\"nominative\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06322150\"]}");
	add("{\"term\":\"nominator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10379800\"]}");
	add("{\"term\":\"nominee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09909143\"]}");
	add("{\"term\":\"nomogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03833256\"]}");
	add("{\"term\":\"nomograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03833256\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }