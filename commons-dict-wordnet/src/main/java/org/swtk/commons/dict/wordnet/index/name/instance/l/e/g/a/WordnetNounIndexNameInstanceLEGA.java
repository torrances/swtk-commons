package org.swtk.commons.dict.wordnet.index.name.instance.l.e.g.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEGA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"legacy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13284678\"]}");
	add("{\"term\":\"legalese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07085406\"]}");
	add("{\"term\":\"legalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01197870\"]}");
	add("{\"term\":\"legalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06222037\"]}");
	add("{\"term\":\"legality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04816489\"]}");
	add("{\"term\":\"legalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01197870\"]}");
	add("{\"term\":\"legate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10273176\"]}");
	add("{\"term\":\"legatee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10273308\"]}");
	add("{\"term\":\"legateship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00595375\"]}");
	add("{\"term\":\"legation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08420039\", \"00595375\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }