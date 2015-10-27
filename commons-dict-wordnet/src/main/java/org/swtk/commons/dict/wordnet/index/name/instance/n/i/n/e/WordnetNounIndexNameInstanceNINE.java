package org.swtk.commons.dict.wordnet.index.name.instance.n.i.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNINE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nine\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03831088\", \"08096490\", \"13767410\"]}");
	add("{\"term\":\"ninepence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13412866\"]}");
	add("{\"term\":\"ninepin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03830811\"]}");
	add("{\"term\":\"ninepins\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00463444\"]}");
	add("{\"term\":\"niner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13767410\"]}");
	add("{\"term\":\"nineteen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13770129\"]}");
	add("{\"term\":\"nineteenth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13870981\"]}");
	add("{\"term\":\"nineties\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"15176215\", \"15176339\", \"15176430\"]}");
	add("{\"term\":\"ninetieth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13871808\"]}");
	add("{\"term\":\"ninety\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13772437\"]}");
	add("{\"term\":\"nineveh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08939248\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }