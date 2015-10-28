package org.swtk.commons.dict.wordnet.indexbyname.instance.m.a.j;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMAJ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"maja\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01984525\"]}");
	add("{\"term\":\"majagua\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12199011\", \"12200685\"]}");
	add("{\"term\":\"majesty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04737242\"]}");
	add("{\"term\":\"majidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01984184\"]}");
	add("{\"term\":\"majolica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03718975\"]}");
	add("{\"term\":\"major\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06006837\", \"10303063\", \"11170624\", \"10302867\"]}");
	add("{\"term\":\"majorana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12873690\"]}");
	add("{\"term\":\"majorca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09047214\"]}");
	add("{\"term\":\"majorette\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10056417\", \"10056527\"]}");
	add("{\"term\":\"majority\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"15177022\", \"13602270\", \"05129822\"]}");
	add("{\"term\":\"majors\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08248420\"]}");
	add("{\"term\":\"majuscule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06837277\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }