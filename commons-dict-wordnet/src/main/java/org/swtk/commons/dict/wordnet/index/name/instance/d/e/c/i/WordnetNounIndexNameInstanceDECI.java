package org.swtk.commons.dict.wordnet.index.name.instance.d.e.c.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDECI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"decibel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13735738\"]}");
	add("{\"term\":\"deciding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05796154\"]}");
	add("{\"term\":\"decidua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05527358\"]}");
	add("{\"term\":\"decigram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13745580\"]}");
	add("{\"term\":\"decile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05745927\"]}");
	add("{\"term\":\"deciliter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13645383\"]}");
	add("{\"term\":\"decilitre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13645383\"]}");
	add("{\"term\":\"decimal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13606512\", \"13758337\"]}");
	add("{\"term\":\"decimalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00195263\"]}");
	add("{\"term\":\"decimalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00195263\"]}");
	add("{\"term\":\"decimation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00219294\"]}");
	add("{\"term\":\"decimeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13680844\"]}");
	add("{\"term\":\"decimetre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13680844\"]}");
	add("{\"term\":\"decipherer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10014791\", \"10014936\"]}");
	add("{\"term\":\"decipherment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00618299\"]}");
	add("{\"term\":\"decision\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04871200\", \"07308252\", \"07308384\", \"05846685\", \"00163453\"]}");
	add("{\"term\":\"decisiveness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04761695\", \"04871200\"]}");
	add("{\"term\":\"decius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10946668\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }