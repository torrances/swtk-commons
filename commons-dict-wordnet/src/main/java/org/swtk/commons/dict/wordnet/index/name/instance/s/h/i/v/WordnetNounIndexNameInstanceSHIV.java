package org.swtk.commons.dict.wordnet.index.name.instance.s.h.i.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHIV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"shiv\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04205765\"]}");
	add("{\"term\":\"shiva\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09551861\", \"15321732\"]}");
	add("{\"term\":\"shivah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15321732\"]}");
	add("{\"term\":\"shivaism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06249067\", \"08114038\"]}");
	add("{\"term\":\"shivaist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09704942\"]}");
	add("{\"term\":\"shivaree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07068162\"]}");
	add("{\"term\":\"shiver\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07535351\", \"00869661\"]}");
	add("{\"term\":\"shivering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14363692\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }