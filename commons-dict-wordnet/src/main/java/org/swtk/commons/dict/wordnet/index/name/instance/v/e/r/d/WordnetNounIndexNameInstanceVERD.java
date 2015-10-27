package org.swtk.commons.dict.wordnet.index.name.instance.v.e.r.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVERD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"verdancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05123890\"]}");
	add("{\"term\":\"verdandi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09605901\"]}");
	add("{\"term\":\"verdi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11383015\"]}");
	add("{\"term\":\"verdicchio\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07915635\", \"13168701\"]}");
	add("{\"term\":\"verdict\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01194640\"]}");
	add("{\"term\":\"verdigris\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04535374\", \"15121091\"]}");
	add("{\"term\":\"verdin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01596194\"]}");
	add("{\"term\":\"verdolagas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11878546\"]}");
	add("{\"term\":\"verdun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01301064\"]}");
	add("{\"term\":\"verdure\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05123890\", \"13174428\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }