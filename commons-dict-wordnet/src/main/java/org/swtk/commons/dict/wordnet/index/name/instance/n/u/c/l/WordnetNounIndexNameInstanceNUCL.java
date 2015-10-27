package org.swtk.commons.dict.wordnet.index.name.instance.n.u.c.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNUCL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nuclease\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14988055\"]}");
	add("{\"term\":\"nucleole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05442853\"]}");
	add("{\"term\":\"nucleolus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05442853\"]}");
	add("{\"term\":\"nucleon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09397798\"]}");
	add("{\"term\":\"nucleonics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06110162\"]}");
	add("{\"term\":\"nucleoplasm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05442360\"]}");
	add("{\"term\":\"nucleoprotein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14759084\"]}");
	add("{\"term\":\"nucleoside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14988506\"]}");
	add("{\"term\":\"nucleosynthesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13544706\"]}");
	add("{\"term\":\"nucleotide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14988729\"]}");
	add("{\"term\":\"nucleus\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"05328312\", \"05509583\", \"09398135\", \"08259144\", \"09397997\", \"05442503\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }