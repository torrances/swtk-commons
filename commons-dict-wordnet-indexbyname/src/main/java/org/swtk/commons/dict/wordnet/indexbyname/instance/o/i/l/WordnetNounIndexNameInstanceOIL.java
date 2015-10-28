package org.swtk.commons.dict.wordnet.indexbyname.instance.o.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oil\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07689142\", \"15005138\", \"03848612\", \"14991055\"]}");
	add("{\"term\":\"oilbird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01840167\"]}");
	add("{\"term\":\"oilcan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03848836\"]}");
	add("{\"term\":\"oilcloth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03848958\"]}");
	add("{\"term\":\"oiler\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03850710\", \"03850880\", \"10394114\"]}");
	add("{\"term\":\"oilfield\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08677492\"]}");
	add("{\"term\":\"oilfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02625342\"]}");
	add("{\"term\":\"oiliness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04875718\", \"05007281\"]}");
	add("{\"term\":\"oilman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10394240\", \"10394351\"]}");
	add("{\"term\":\"oilpaper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14992790\"]}");
	add("{\"term\":\"oilrig\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03245796\"]}");
	add("{\"term\":\"oilseed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11709952\"]}");
	add("{\"term\":\"oilskin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03850335\"]}");
	add("{\"term\":\"oilstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03850627\"]}");
	add("{\"term\":\"oilstove\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03849403\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }