package org.swtk.commons.dict.wordnet.index.name.instance.l.a.c.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLACT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lactaid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14953023\"]}");
	add("{\"term\":\"lactalbumin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14755895\"]}");
	add("{\"term\":\"lactarius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13027137\"]}");
	add("{\"term\":\"lactase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14953023\"]}");
	add("{\"term\":\"lactate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14703941\"]}");
	add("{\"term\":\"lactation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00844658\", \"13527190\", \"15167796\"]}");
	add("{\"term\":\"lacteal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05404375\"]}");
	add("{\"term\":\"lactifuge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14953347\"]}");
	add("{\"term\":\"lactobacillaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01382277\"]}");
	add("{\"term\":\"lactobacillus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01382759\"]}");
	add("{\"term\":\"lactobacteriaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01382277\"]}");
	add("{\"term\":\"lactoflavin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15116040\"]}");
	add("{\"term\":\"lactogen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14953488\"]}");
	add("{\"term\":\"lactophrys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02657239\"]}");
	add("{\"term\":\"lactose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14953600\"]}");
	add("{\"term\":\"lactosuria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14530522\"]}");
	add("{\"term\":\"lactuca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12006560\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }