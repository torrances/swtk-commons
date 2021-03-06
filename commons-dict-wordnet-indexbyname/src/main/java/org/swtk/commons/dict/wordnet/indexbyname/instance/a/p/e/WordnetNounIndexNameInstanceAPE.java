package org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAPE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ape\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09815626\", \"09983941\", \"02472956\"]}");
	add("{\"term\":\"apeldoorn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08969808\"]}");
	add("{\"term\":\"apennines\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09223752\"]}");
	add("{\"term\":\"aper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09983941\"]}");
	add("{\"term\":\"apercu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06480420\"]}");
	add("{\"term\":\"aperea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02367492\"]}");
	add("{\"term\":\"aperient\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04032142\"]}");
	add("{\"term\":\"aperitif\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07902438\"]}");
	add("{\"term\":\"aperture\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02729941\", \"09223909\", \"02730066\"]}");
	add("{\"term\":\"apery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00550509\"]}");
	add("{\"term\":\"apetalous flower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11694470\"]}");
	add("{\"term\":\"apex\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08511997\", \"08695539\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }