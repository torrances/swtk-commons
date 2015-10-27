package org.swtk.commons.dict.wordnet.index.name.instance.w.h.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWHEE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wheedler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10795047\"]}");
	add("{\"term\":\"wheedling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00160719\"]}");
	add("{\"term\":\"wheel\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"02837983\", \"04045517\", \"04120500\", \"04583009\", \"05203188\", \"04320641\", \"04582285\"]}");
	add("{\"term\":\"wheelbarrow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02800454\"]}");
	add("{\"term\":\"wheelbase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05094380\"]}");
	add("{\"term\":\"wheelchair\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04583288\"]}");
	add("{\"term\":\"wheeler\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02390233\", \"10005719\", \"10795204\", \"10795328\", \"11403273\"]}");
	add("{\"term\":\"wheelhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03945953\"]}");
	add("{\"term\":\"wheeling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00123350\", \"09179792\"]}");
	add("{\"term\":\"wheelwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04584257\"]}");
	add("{\"term\":\"wheelwright\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10795328\"]}");
	add("{\"term\":\"wheeze\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05917978\", \"00838068\"]}");
	add("{\"term\":\"wheeziness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14396260\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }