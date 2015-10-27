package org.swtk.commons.dict.wordnet.index.name.instance.f.i.n.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFINA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"finagler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10109384\"]}");
	add("{\"term\":\"final\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07212936\", \"07481972\"]}");
	add("{\"term\":\"finale\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00211646\", \"15292365\", \"07053224\"]}");
	add("{\"term\":\"finalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00212311\"]}");
	add("{\"term\":\"finalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10109548\"]}");
	add("{\"term\":\"finality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04761695\"]}");
	add("{\"term\":\"finalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00212311\"]}");
	add("{\"term\":\"finance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01136358\", \"06160103\", \"01100603\"]}");
	add("{\"term\":\"finances\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13377127\"]}");
	add("{\"term\":\"financier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10109789\"]}");
	add("{\"term\":\"financing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01101014\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }