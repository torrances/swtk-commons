package org.swtk.commons.dict.wordnet.index.name.instance.p.e.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePENE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"peneidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01990579\"]}");
	add("{\"term\":\"penelope\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01802517\", \"09616318\"]}");
	add("{\"term\":\"peneplain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09411546\"]}");
	add("{\"term\":\"peneplane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09411546\"]}");
	add("{\"term\":\"penetrability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04947907\"]}");
	add("{\"term\":\"penetralium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08606395\"]}");
	add("{\"term\":\"penetration\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00848447\", \"05142553\", \"05208720\", \"00052345\", \"05718303\", \"00977538\"]}");
	add("{\"term\":\"penetrator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10433433\"]}");
	add("{\"term\":\"peneus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01990705\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }