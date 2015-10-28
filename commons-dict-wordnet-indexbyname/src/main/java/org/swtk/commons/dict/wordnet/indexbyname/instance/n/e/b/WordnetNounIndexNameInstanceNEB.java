package org.swtk.commons.dict.wordnet.indexbyname.instance.n.e.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNEB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"neb\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01760949\", \"02455268\"]}");
	add("{\"term\":\"nebbech\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10370505\"]}");
	add("{\"term\":\"nebbish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10370505\"]}");
	add("{\"term\":\"nebcin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04450722\"]}");
	add("{\"term\":\"nebe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13854193\"]}");
	add("{\"term\":\"nebiim\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06464271\"]}");
	add("{\"term\":\"nebn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13853916\"]}");
	add("{\"term\":\"nebo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09542731\"]}");
	add("{\"term\":\"nebraska\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09132074\"]}");
	add("{\"term\":\"nebraskan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09763492\"]}");
	add("{\"term\":\"nebuchadnezzar\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03819486\", \"11222053\"]}");
	add("{\"term\":\"nebuchadrezzar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11222053\"]}");
	add("{\"term\":\"nebula\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04689541\", \"09389837\", \"14338183\", \"14984745\"]}");
	add("{\"term\":\"nebule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09390034\"]}");
	add("{\"term\":\"nebuliser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02757108\"]}");
	add("{\"term\":\"nebulizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02757108\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }