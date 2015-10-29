package org.swtk.commons.dict.wordnet.indexbyname.instance.y.u.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceYUC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"yucatan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08757855\", \"08758063\"]}");
	add("{\"term\":\"yucatan peninsula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08757855\"]}");
	add("{\"term\":\"yucatec\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06938694\", \"09692668\"]}");
	add("{\"term\":\"yucateco\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06938694\", \"09692668\"]}");
	add("{\"term\":\"yucca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12502536\"]}");
	add("{\"term\":\"yucca aloifolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12502942\"]}");
	add("{\"term\":\"yucca baccata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12503173\"]}");
	add("{\"term\":\"yucca brevifolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12503398\"]}");
	add("{\"term\":\"yucca carnerosana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12503596\"]}");
	add("{\"term\":\"yucca elata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12503787\"]}");
	add("{\"term\":\"yucca filamentosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12503932\"]}");
	add("{\"term\":\"yucca glauca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12504130\"]}");
	add("{\"term\":\"yucca gloriosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12504346\"]}");
	add("{\"term\":\"yucca smalliana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12504534\"]}");
	add("{\"term\":\"yucca whipplei\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12504749\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }