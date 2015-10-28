package org.swtk.commons.dict.wordnet.indexbyname.instance.a.b.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceABE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"abecedarian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08110619\", \"09775119\"]}");
	add("{\"term\":\"abecedarius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06389594\"]}");
	add("{\"term\":\"abel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09610392\", \"10826801\"]}");
	add("{\"term\":\"abelard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10826921\"]}");
	add("{\"term\":\"abele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12752769\"]}");
	add("{\"term\":\"abelia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12692412\"]}");
	add("{\"term\":\"abelmoschus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12192267\"]}");
	add("{\"term\":\"abelmosk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12192998\"]}");
	add("{\"term\":\"abenaki\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09665709\"]}");
	add("{\"term\":\"aberdare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08915375\"]}");
	add("{\"term\":\"aberdeen\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08912413\", \"09116677\", \"09162102\", \"09176333\"]}");
	add("{\"term\":\"aberrance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14527267\"]}");
	add("{\"term\":\"aberrancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14527267\"]}");
	add("{\"term\":\"aberrant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09775224\"]}");
	add("{\"term\":\"aberration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11440253\", \"14409995\", \"14527267\"]}");
	add("{\"term\":\"abetalipoproteinemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14175366\"]}");
	add("{\"term\":\"abetment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07266287\"]}");
	add("{\"term\":\"abettal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07266287\"]}");
	add("{\"term\":\"abetter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09775380\"]}");
	add("{\"term\":\"abettor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09775380\"]}");
	add("{\"term\":\"abeyance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14034107\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }