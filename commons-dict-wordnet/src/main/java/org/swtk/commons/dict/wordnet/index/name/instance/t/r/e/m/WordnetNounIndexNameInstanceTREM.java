package org.swtk.commons.dict.wordnet.index.name.instance.t.r.e.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTREM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"trema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12430710\"]}");
	add("{\"term\":\"trematoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01928110\"]}");
	add("{\"term\":\"trematode\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01928336\"]}");
	add("{\"term\":\"tremble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00869661\"]}");
	add("{\"term\":\"trembler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10517631\"]}");
	add("{\"term\":\"trembles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14299703\"]}");
	add("{\"term\":\"trembling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14028057\"]}");
	add("{\"term\":\"tremella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13081672\"]}");
	add("{\"term\":\"tremellaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13081449\"]}");
	add("{\"term\":\"tremellales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13081211\"]}");
	add("{\"term\":\"tremolite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14750120\"]}");
	add("{\"term\":\"tremolo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07413936\", \"14028443\"]}");
	add("{\"term\":\"tremor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14028622\", \"07444084\", \"00349627\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }