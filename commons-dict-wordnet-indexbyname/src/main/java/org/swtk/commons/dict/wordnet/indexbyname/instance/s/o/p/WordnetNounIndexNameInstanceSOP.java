package org.swtk.commons.dict.wordnet.indexbyname.instance.s.o.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSOP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sop\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01026910\", \"07231275\", \"07877397\"]}");
	add("{\"term\":\"soph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10644800\"]}");
	add("{\"term\":\"sophism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05903745\"]}");
	add("{\"term\":\"sophist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09919381\", \"10644461\"]}");
	add("{\"term\":\"sophisticate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10644647\"]}");
	add("{\"term\":\"sophistication\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00754815\", \"04887468\", \"05649050\", \"05903745\", \"05996720\"]}");
	add("{\"term\":\"sophistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05903745\"]}");
	add("{\"term\":\"sophocles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11328619\"]}");
	add("{\"term\":\"sophomore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10644800\"]}");
	add("{\"term\":\"sophonias\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06452333\", \"11426019\"]}");
	add("{\"term\":\"sophora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12590631\"]}");
	add("{\"term\":\"sopor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14049464\"]}");
	add("{\"term\":\"soporific\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04268044\"]}");
	add("{\"term\":\"soprano\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04993179\", \"06886189\", \"10644908\"]}");
	add("{\"term\":\"sops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07877397\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }