package org.swtk.commons.dict.wordnet.index.name.instance.m.o.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMOON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"moon\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"09381123\", \"11209044\", \"11505375\", \"15232668\", \"09381447\", \"09381255\"]}");
	add("{\"term\":\"moonbeam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11505261\"]}");
	add("{\"term\":\"mooneye\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14297953\"]}");
	add("{\"term\":\"moonfish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02548472\", \"02580864\"]}");
	add("{\"term\":\"moonflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12848297\"]}");
	add("{\"term\":\"moong\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07741018\", \"12599160\"]}");
	add("{\"term\":\"moonie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10350152\"]}");
	add("{\"term\":\"moonlight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11505375\"]}");
	add("{\"term\":\"moonlighter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10350306\"]}");
	add("{\"term\":\"moonseed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11733633\"]}");
	add("{\"term\":\"moonshell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01950638\"]}");
	add("{\"term\":\"moonshine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07918760\", \"11505375\"]}");
	add("{\"term\":\"moonshiner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09886328\"]}");
	add("{\"term\":\"moonstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14978961\"]}");
	add("{\"term\":\"moonwalk\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00293113\", \"00293969\"]}");
	add("{\"term\":\"moonwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12981872\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }